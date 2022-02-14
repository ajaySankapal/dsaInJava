package g_linked_list;

import java.util.Scanner;

//make before break
//1.create newNode
//2. two nodes will be affected one prev to the given position and second next of the given position
//make before break: if you want to connect prev node to the newNode make sure you have reference to the next node
//if we have to insert newNode at pos 0 we have to consider that in this case head of the linked will be changed we have to update the head of the linked list and return it
public class J_insert_node_at_given_index {

	// insert node at the given index
	public static Node<Integer> insert(Node<Integer> head, int x, int pos) {
		Node<Integer> nodeToBeInserted = new Node<>(x);

		int count = 0;
		Node<Integer> prev = head;
        
		//if pos == 0
		if(pos==0) {
			nodeToBeInserted.next = head;
			head = nodeToBeInserted;
			return head;
		}else {
			while (count < pos - 1 && prev != null) {
				count++;
				prev = prev.next;
			}
			// make before break
			if (prev != null) {
				nodeToBeInserted.next = prev.next;
				prev.next = nodeToBeInserted;
			}
			return head;
		}
		
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
		head = insert(head, 20, 0); // if we want to insert element at the index greater than the length of the
								// linked list it will throw an error of null //java.lang.NullPointerException
								// // to avoid this problem we have to write a condition in loop while prev.next
								// is not equal to null
		                        // if we want to insert node at 0 we have to return the new node bcs it will be treated as head and it will have to collect in main and have to pass in print method
		print(head);

	}

}
