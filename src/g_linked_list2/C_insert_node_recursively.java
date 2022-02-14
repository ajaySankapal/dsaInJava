package g_linked_list2;

import java.util.Scanner;

public class C_insert_node_recursively {

	// take input of the linked list
			public static Node<Integer> takeInput() {
				Scanner s = new Scanner(System.in);
				Node<Integer> head = null, tail = null;
				int data = s.nextInt();
				while (data != -1) {
					Node<Integer> currentNode = new Node<>(data);
					if (head == null) {
						head = currentNode;
						tail = currentNode;
					} else {
						tail.next = currentNode;
						tail = tail.next;
					}

					data = s.nextInt();
				}
				return head;
			}
			
			//print using recursion
			public static void printR(Node<Integer> head) {
				if(head == null) return ;
				System.out.print(head.data+" ");
				printR(head.next);
			}
			
			public static Node<Integer> insertNodeR(Node<Integer> head,int elem,int pos){
				Node<Integer> newNode = new Node<>(elem);
				if(head == null && pos>0) {
					return head;
				}
				if(pos == 0) {
					newNode.next = head;
					return newNode;
				}else {
					head.next = insertNodeR(head.next,elem,pos-1);
					return head;
				}
				
			}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = insertNodeR(head,20,5);
		printR(head);

	}

}
