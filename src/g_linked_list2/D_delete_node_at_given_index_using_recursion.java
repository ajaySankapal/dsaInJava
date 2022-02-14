package g_linked_list2;



public class D_delete_node_at_given_index_using_recursion {

	//creating linked list
			public static Node<Integer> createLinkedList(){
				Node<Integer> n1 = new Node<>(10);
				Node<Integer> n2 = new Node<>(4);
				Node<Integer> n3 = new Node<>(3);
				Node<Integer> n4 = new Node<>(30);
				Node<Integer> n5 = new Node<>(5);
				n1.next = n2;
				n2.next = n3;
				n3.next = n4;
				n4.next = n5;
		        return n1;		
			}
			
	//print using recursion
			public static void printR(Node<Integer> head) {
				Node<Integer> temp = head;
				if(temp == null) return ;
				System.out.print(temp.data+" ");
				printR(temp.next);
			}
			
   //delete node
			public static Node<Integer> deleteNode(Node<Integer> head,int pos){
				if(head == null && pos>0) {
					return head;
				}
				if(pos == 0) {
					return head.next;
				}else {
					head.next = deleteNode(head.next,pos-1);
					return head;
				}
			}
	
	public static void main(String[] args) {
		Node<Integer> head = createLinkedList();
		head = deleteNode(head,2);
		printR(head);

	}

}
