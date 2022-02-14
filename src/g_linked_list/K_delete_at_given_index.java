package g_linked_list;

import java.util.Scanner;

public class K_delete_at_given_index {

	// insert node at the given index
	public static Node<Integer> delete(Node<Integer> head,  int pos) {
        int count = 0;
        Node<Integer> prev = head;
		//handling the pos = 0 case
		if(pos == 0) {
			return head.next;
		}
		while(count<pos-1) {
			count++;
			prev = prev.next;
		}
		if(prev == null || prev.next == null) {
			return head;
		}
		prev.next = prev.next.next;
		return head;
		}
		
	
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

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
//		insert(head,20,1);
		delete(head,2 ); // if we want to insert element at the index greater than the length of the
								// linked list it will throw an error of null //java.lang.NullPointerException
								// // to avoid this problem we have to write a condition in loop while prev.next
								// is not equal to null
		                        // if we want to insert node at 0 we have to return the new node bcs it will be treated as head and it will have to collect in main and have to pass in print method
		print(head);

	}

}
