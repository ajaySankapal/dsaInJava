package g_linked_list;

public class F_length_of_LL {
	
	//creating linked list
		public static Node<Integer> createLinkedList(){
			Node<Integer> n1 = new Node<>(10);
			Node<Integer> n2 = new Node<>(20);
			Node<Integer> n3 = new Node<>(30);
			Node<Integer> n4 = new Node<>(30);
			n1.next = n2;
			n2.next = n3;
			n3.next = n4;
	        return n1;		
		}
		
		//printing linked list
		public static void print(Node<Integer> head) {
			//here we are passing the reference and changing the value of that reference.
			Node<Integer> temp = head;
			while(head != null) {
				System.out.print(head.data+" ");
				head = head.next;
			}
			System.out.println("");
		}
		
	//length of linked list
		public static int lengthOfLL(Node<Integer> head) {
			Node<Integer> temp = head;
			int count = 0;
			while(temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}

	public static void main(String[] args) {
		Node<Integer> head = createLinkedList();
		print(head);
        System.out.println(lengthOfLL(head));
	}

}
