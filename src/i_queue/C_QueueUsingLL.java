package i_queue;

import g_linked_list.Node;

//add at the tail of the linked list and delete from the front
//f               r
//1-->2-->3-->4-->5-->x
//deleting from the front is pretty simple 

public class C_QueueUsingLL<T> {
	private Node<T> front;
	private Node<T> rear;
	int size;

	public C_QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}

	public int size() {
	return size;	
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void enqueue(T elem) {
		Node<T> newNode = new Node<T>(elem);
		if(rear==null) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
	
		size++;
	}
	public T dequeue() throws QueueEmptyException {
		if(front==null) {
			throw new QueueEmptyException();
		}
		
		if(front==null) {
			rear = null;
		}
		T temp = front.data;
		front = front.next;
		size--;
		return temp;
		
	}
	public T front()throws QueueEmptyException {
		if(front==null) {
			throw new QueueEmptyException();
		}

		return front.data;
	}
	
	
	
	
	
	
	
	
	
	
	
}
