package i_queue;

import java.util.LinkedList;
import java.util.Queue;

public class D_queue_using_collections {

	public static void main(String[] args) {
    
		//queue is an interface, creating a reference of which is not allowed
		//reference is completely ok
		//it will refer to the object of the class which has implemented it. so linkedlist is the class which has implemented queue
	Queue<Integer> queue = new LinkedList<>();
	queue.add(10);
	queue.add(20);
	System.out.println(queue.size());
	System.out.println(queue.poll()); //remove element
	System.out.println(queue.size());
	System.out.println(queue.element());
	}

}
