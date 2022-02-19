package g_linked_list2;

import java.util.Scanner;
//https://leetcode.com/problems/middle-of-the-linked-list/
public class F_middle_of_LL {

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

			// printing linked list
			public static void print(Node<Integer> head) {
				while (head != null) {
					System.out.print(head.data + " ");
					head = head.next;
				}
				System.out.println("");
			}
			
			//middle of the linked list
			public static int  middle(Node<Integer> head) {
				Node<Integer> slow = head;
				Node<Integer> fast = head;
				while(fast != null && fast.next != null) {
					slow = slow.next;
					fast = fast.next.next;
					
					
				}
				return slow.data;
			}

	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
	    System.out.println(middle(head));

	}

}
