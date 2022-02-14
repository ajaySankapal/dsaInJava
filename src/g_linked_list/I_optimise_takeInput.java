package g_linked_list;

import java.util.Scanner;
//time complexity : O(n)
public class I_optimise_takeInput {

	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null,tail=null;
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> currentNode = new Node<>(data);
			if(head == null) {
				head = currentNode;
				tail = currentNode;
			}else {
//				Node<Integer> tail = head;  //here tail is starting from head and going until tail.next==null so for 2nd node we will go through loop one time for 3rd node 2 and so on...
//				while(tail.next != null) {
//					tail = tail.next;
//				}
				tail.next = currentNode;   //for currentNode increment tail.next to the currentNode and update the tail to the nextnode
				tail = tail.next;
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
