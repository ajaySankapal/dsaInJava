package g_linked_list2;

import java.util.Scanner;



public class B_print_in_reverse_order {

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
			if(head == null) return;
			printR(head.next);
			System.out.print(head.data+" ");
		}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		printR(head);

	}

}
