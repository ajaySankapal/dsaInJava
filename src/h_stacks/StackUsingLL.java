package h_stacks;


public class StackUsingLL<T> {
private Node<T> head;
private int size;

StackUsingLL(){
	head = null;
	size = 0;
}

//in order to decrease the time-complexities for various operation we add new node to the head


public void push(T elem) {
//to push any element we have to iterate through the linked list till head becomes null so.
//so the push operation on linked list can take O(N) time 
//to reduce the time complexity we can maintain a tail variable which will be pointing at the end of the linked list
//add new node to the head
//new node's next will point to the head and we update the head by newnode
	
	Node<T> newNode = new Node<T>(elem);
	newNode.next = head;
	head = newNode;
	size++;
}

public T pop() throws StackEmptyException {
//time complexity O(N): we can reduce this time-complexity by any mean
//remove the head and new head will be the head.next
	if(head == null) {
		throw new StackEmptyException();
	}
	T temp = head.data;
	head = head.next;
	size--;
	return temp;
}

public T top() throws StackEmptyException {
	//the element at head
	if(head == null) {
		throw new StackEmptyException();
	}
	return head.data;
}

public int size() {
	return size;
}

public boolean isEmpty() {
	return size==0; 
}

}
