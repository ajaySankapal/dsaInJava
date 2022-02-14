package g_linked_list2;

import java.util.Scanner;

//https://leetcode.com/problems/reverse-linked-list/

public class E_reverse_linked_list {

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
		
		//reverse linked list
		public static Node<Integer> reverse(Node<Integer> head){
			if(head == null || head.next == null) {    //at the last recursion call the node is pointing to null so it is our base case in that case we have to set head to that node. now our task is to set the next of this node to the prev node so we create a reference tail and 
				return head;
			}
			Node<Integer> smallHead = reverse(head.next);
			Node<Integer> tail = smallHead;
			while(tail.next != null) {
				tail = tail.next;
			}
			tail.next = head;
			head.next = null;
			return smallHead;
		}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = reverse(head);
		print(head);

	}

}
