package g_linked_list;

import java.util.Scanner;

public class H_takeInput {

	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null;
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> createNode = new Node<>(data);
			if(head == null) {
				head = createNode;
			}else {
				Node<Integer> tail = head;
				while(tail.next != null) {
					tail = tail.next;
				}
				tail.next = createNode;
			}
			
			data = s.nextInt();
		}
		return head;
	}
	
	//printing linked list
		public static void print(Node<Integer> head) {
			while(head != null) {
				System.out.print(head.data+" ");
				head = head.next;
			}
			System.out.println("");
		}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);

	}

}
