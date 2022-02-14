package g_linked_list;

//linked list: A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. The elements in a linked list are linked using pointers 
// [data|address->]     last node points to null
//advantages
//    1. dynamic size
//    2. ease in insertion and deletion
//disadvantages
//    1. can not access elements randomly
//    2. extra memory space for pointers is required to store the address of the node
//    3. not locality of reference as data is stored in not contagoius fashion

//head is associated to the first node of the linked list
//tail is associated to the last node of the linked list
//the best practice is to store head in the temp variable because if we want to use or access the linked list we could face problems because the head of the list would have been changed.




public class C_linkedList {
	//print linked list
	public static void print(Node<Integer> head) {
		System.out.println(head);
//		System.out.println(head.next.next.data);
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		temp = head;
//		while(head != null) {
//			System.out.print(head.data+" ");
//			head = head.next;
//		}    // if we take two while loop it will print list only once because we have base case head!=null and by the time we reach to second while loop value of head becomes null
	}
	
	
	//create linked list
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10); // we are passing 10 in the constructor which passing 10 to the data
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next = n2;
//		System.out.println("n1 "+n1+"data "+n1.data+"next "+n1.next);
		n2.next = n3;
//		System.out.println("n2 "+n2+"data "+n2.data+"next "+n2.next);
		n3.next = n4;
//		System.out.println("n1 "+n3+"data "+n3.data+"next "+n3.next);
//		System.out.println("n1 "+n4+"data "+n4.data+"next "+n4.next);
		return n1;//head(first node)
	}

	public static void main(String[] args) {
		Node<Integer> head = createLinkedList();
//		System.out.println(head);
		print(head);
		System.out.println("");
//		System.out.println(head);
		print(head);  //pass by value. the parameter we get in first print function is only passed by value. in second invokation of print method the parameter we pass is differente the prev print method did'nt modify head bcz it is just passed by value
		
		
//		System.out.println(n1);
//		System.out.println("n1 next"+n1.next);
//		System.out.println("n2"+n2);
//		System.out.println("n2 next "+n2.next);
//		System.out.println("n3"+n3);
//		System.out.println("n2 next "+n3.next);

//		System.out.println(n1.head);

	}

}
