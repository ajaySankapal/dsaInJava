package g_linked_list;

public class G_print_ith_element_in_LL {

	//creating linked list
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(4);
		Node<Integer> n3 = new Node<>(5);
		Node<Integer> n4 = new Node<>(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		return n1;
	}
	
	//finding ith element
	public static int findIthElement(Node<Integer> head,int i) {
		int count = -1;
		int ans = 0;
		while(head != null) {
			count++;
			if(count == i) {
				ans = head.data;
			}
			head = head.next;
		}
		return ans;
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
		Node<Integer> head = createLinkedList();
		print(head);
        System.out.println(findIthElement(head,3));
	}

}
