package g_linked_list2;

import java.util.Scanner;

public class Z_Practice {

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
	
				//reverse linked list using recursion
				public static Node<Integer> reverse(Node<Integer> head){
					if(head == null || head.next == null) {
						return head;
					}
					while(head != null) {
						reverse(head.next);
						head.next = head;
					}
					
					
					return head;
				}
				
				//reverse linked list using iteration
				public static Node<Integer> reverseI(Node<Integer> head){
					Node<Integer> newHead = null;
					while(head != null) {
						Node<Integer> next = head.next;
						head.next = newHead;
						newHead = head;
						head = next;
					}
					return newHead;
				}
				
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
//		head =reverse(head);
		head = reverseI(head);
		
		printR(head);

	}

}
