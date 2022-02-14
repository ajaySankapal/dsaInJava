package g_linked_list;



public class D_increment_every_element_in_LL {

	//creating linked list
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		n1.next = n2;
		n2.next = n3;
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
	}
	
	//increment head
	public static void increment(Node<Integer> head) {
		//here we are passing the reference but changing the value of data referred by that reference so data will be changed
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
     
	Node<Integer> head = createLinkedList();	
	increment(head);//this head is pointing to the data 
    print(head);  //this head also pointing to the same data
	}

}
