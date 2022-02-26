package i_queue;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException  {
		QueueUsingArray queue = new QueueUsingArray();
	    int nums[] = {1,2,3,4,5,6,4,7,8,9};
	    for(int elem : nums) {
	    	queue.enqueue(elem);
	    }
	    System.out.println(queue.isEmpty());
	    while(!queue.isEmpty()) {
	    	System.out.println(queue.dequeue());
	    }
	    System.out.println(queue.isEmpty());

	}

}
