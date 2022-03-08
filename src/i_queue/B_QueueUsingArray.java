package i_queue;

//this code may fail. let see an dry run of the code we have written
//f       r    size=3
//0   1   2
//10  20  30

//opertion1* dequeue()
//front++;
//size--;
//    f     r    size=2
// 0   1     2
// __  20    30  //there is vaccant place at index 0

//operation 2* enqueue(40)
//rear++;    rear = 3
//data[3] = 40 //which is not valid because the size of the array which we declared is 3. and here we are trying to access the 4th index.
//as per the logic as per the size there is room for one element.but what we are doing here is we are increasing rear by one which are making rear out of bound
//to deal with this problem,, instead of trying to insert it at index 3 insert it at index 0.because that is the index which has space now.
//so instead of going ahead in one direction we should come at beginning in circular fashion and start inserting element at the begining again.
//this is the concept of "circular queue"

public class B_QueueUsingArray {

	private int data[]; // array to store the elements of the queue
	private int front; // index of the element at the front of the queue
	private int rear; // index of the element at the rear of the queue
	private int size;

	public B_QueueUsingArray() {

		// initialize the size of the array for queue
		data = new int[5];
		front = -1;
		rear = -1;
	}

	public int size() {
		return size;
	}

	public void enqueue(int elem)  {
		if (size == 0) {
			front = 0;
		}
		if (size == data.length) {
//			throw new QueueFullException();
		//making the queue dynamic
			doubleCapacity();
		}
		// circular queue
		// f r
		// 0 1 2
		// 40 20 30

//    	   rear++;
//    	   if(rear==data.length) {
//    		   rear = 0;
//    	   }
		// we can write the above code in much fine way
		rear = (rear + 1) % data.length; // we want to apply rear = 0 when rear becomes data.length .. the code we write
											// here does the same work (rear+1) will be the data array length and rear+1 % data.length will give us 0
											// which will be assigned to rear. if the rear
											// is not equal to data.length, then also it will give us the index between 0 and data.length-1 only
											
		data[rear] = elem;
		size++;
	}

	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2*temp.length];
		//we have to copy the elements which we added previously
		//first approach is we run a loop and copy all the elements in the new array. 
		//there is some problems in this approach let's see what it is?
		
		//initially our queue is like this
		//f           r
		//0  1  2  3  4
		//10 20 30 40 50
		
		//lets call 2 dequeue() operation
		//       f      r
		// 0  1  2  3  4
		//__ __  20 30 40
		
		//now we have to insert any element. the doubleCapacity method will also be called but we want to utilize the size of the array we declared initially
		//and want to use the two vaccant places
		//what we will do is set rear to 0 and insert new element there // remember circular queue
		//insert two elements by calling enqueue methods two times
		//   r  f     temp.length-1
		//0  1  2  3  4
		//45 55 20 30 40
		//so now copying as it is not a good idea 
		//because we have to maintain the FIFO also 55 is comes last . and if we copy the elements as it is by running a loop 55 will be at 2nd index which is not valid in case of queue
		//so we run two loops separately
		//first loop will copy the elements from "front" to "temp.length"
		//second loop from "rear" to "front-1"
		int index = 0; //index of the new array
		//front to end
		for(int i =front;i<temp.length;i++ ) {
			data[index++] = temp[i];   //copy elements which are at front
		}
		//rear to front-1
		for(int i = 0;i<front-1;i++) {
			data[index++] = temp[i];
		}
		//update the index of front and rear also
		front = 0;
		rear = temp.length-1;
		
	}

	// handling the edge case
	// f r
	// 0 1 2
	// 40 20 30
	// this is the status of our queue. we want to remove elements from the queue

	// operation1* dequeue()
	// front++;
	// f r
	// 1 2
	// 20 30

	// operation2* dequeue()
	// front++;
	// f/r
	// 2
	// 30

	// operation3*
	// front++;
	// f
	// 1 2 3 //index out of bound exception// we are trying to access the 4th index
	//
	public int dequeue() throws QueueEmptyException {
		if (size == 0) {
			throw new QueueEmptyException();
		}

		int temp = data[front];
//		front++;
//		if (front == data.length) {
//			front = 0;
//		}
		front = (front+1)%data.length;
		size--;
		if (size == 0) {
			front = -1;
			rear = -1;
		}
		return temp;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int front() throws QueueEmptyException {
		if (size == 0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}

	public int rear() throws QueueEmptyException {
		if (size == 0) {
			throw new QueueEmptyException();
		}
		return data[rear];
	}
}
