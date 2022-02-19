package g_linked_list2;


//https://leetcode.com/problems/merge-two-sorted-lists/submissions/
//https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
public class G_merge_two_sorted_linked_list {

	//first linked list
		public static Node<Integer> createLinkedList(){
			Node<Integer> n1 = new Node<>(1); // we are passing 10 in the constructor which passing 10 to the data
			Node<Integer> n2 = new Node<>(2);
			Node<Integer> n3 = new Node<>(4);
			Node<Integer> n4 = new Node<>(6);
			Node<Integer> n5 = new Node<>(8);
			Node<Integer> n6 = new Node<>(9);
			n1.next = n2;
			n2.next = n3;
			n3.next = n4;
			n4.next = n5;
			n5.next = n6;
			return n1;
		}
		
		//second linked list
		public static Node<Integer> createLinkedList2(){
			Node<Integer> n1 = new Node<>(3); // we are passing 10 in the constructor which passing 10 to the data
			Node<Integer> n2 = new Node<>(5);
			Node<Integer> n3 = new Node<>(7);
			
			n1.next = n2;
			n2.next = n3;
			
			return n1;
		}
		
		//merge two sorted linked list
		public static Node<Integer> mergeTwoSortedLL(Node<Integer> l1,Node<Integer> l2){
			while(l1.data>l2.data) {
				//temp is pointing to the linked list whose head is small
				Node<Integer> temp = l1;
				l1=l2;
				l2=temp;
			}
			Node<Integer> res = l1;
			while(l1 != null && l2 != null) {
				Node<Integer> tmp = null;
				while(l1 != null && l1.data<=l2.data) {
					//while first lists data is less than second list update tmp and increment index of first list1
					tmp = l1;
					l1 = l1.next;
				}
				//if thats not the case than update tmp to list2
				tmp.next = l2;
				
				//swap list2 with list1
				Node<Integer> temp = l1;
				l1 = l2;
				l2 = temp;
				
			}
			return res;
		}
		
		public static Node<Integer> mergeTwoSortedList(Node<Integer> l1,Node<Integer> l2){
			Node<Integer> dummy = new Node<Integer>(0);
			Node<Integer> head = dummy;
			while(l1 != null && l2!= null) {
				if(l1.data<l2.data) {
					dummy.next = l1;
					l1 = l1.next;
				}else {
					dummy.next = l2;
					l2 = l2.next;
				}
				dummy = dummy.next;
			}
			
			if(l1 != null) {
				dummy.next = l1;
				
			}else {
				dummy.next = l2;
			}
			
			return head.next;
		}
		
		//print using recursion
				public static void printR(Node<Integer> head) {
					if(head == null) return ;
					System.out.print(head.data+" ");
					printR(head.next);
				}
	
	public static void main(String[] args) {
		Node<Integer> l2 = createLinkedList();
		Node<Integer> l1 = createLinkedList2();
//        Node<Integer> head = mergeTwoSortedLL(l1, l2);
		Node<Integer> head = mergeTwoSortedList(l1,l2);
        printR(head);
	}

}
