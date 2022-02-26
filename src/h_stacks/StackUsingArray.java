package h_stacks;

public class StackUsingArray {

	private int data[]; // we are implementing stack and dont want to allow user to change in it . so we
						// make it private. user will be given permission to only
						// add,delete,size,isEmpty properties of the stack. other properties should be
						// made hidden to them
	private int index; // index of the topmost element of the stack

	public StackUsingArray() {
		data = new int[10];
		index = -1;
	}

//push function to add the element in the stack
	public void push(int elem) throws StackFullException {
		// if stock is full
		if (index == data.length - 1) {
//        StackFullException e = new StackFullException();  
//        throw e;
		//when the stack is full we want to double the size of the stack
		doubleCapacity();
		}
		index++;
		data[index] = elem;
	}
	
private void doubleCapacity() {
	
	//we have to keep the prev data also. so we store it in temp array
	int[] temp = data;
	data = new int[2 * temp.length];
	
}

//pop to remove the element from the top
	public int pop() throws StackEmptyException {
		if (index == -1) {
			throw new StackEmptyException();
		}
		int temp = data[index];
		index--;
		return temp;
	}

//returns size of the stack
	public int size() {
		return index + 1;
	}

//peak the element which is at the top
	public int top() throws StackEmptyException {
		if (index == -1) {
			throw new StackEmptyException();
		}
		return data[index];
	}

//returns true if the stack is empty or false if it is not
	public boolean isEmpty() {
//		if(index>=0) {
//			return false;
//		}else {
//			return true;
//		}
		if (index == -1)
			return true;
		else
			return false;
	}

}
