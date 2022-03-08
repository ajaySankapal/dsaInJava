package i_queue;

//push() we simply push elements in the input stack.

//top()  for top we have to check if the output stack is empty or not. if it is empty we copy all  the element from input and push it to output. by this remember the input stack will get empty and now return output.top()
//pop() if the output is not empty then we just pop the element present in the output . if it is empty then we have to copy the element from the input to output
//for almost all the cases the complexities for all the operations are in O(1) , for some cases it is O(n) so it is O(1) amortised
import java.util.Stack;

public class E_queue_using_two_stacks<T> {

	Stack<T> input = new Stack<>();
	Stack<T> output = new Stack<>();
    int size;
   
    E_queue_using_two_stacks(){
    	size = 0;
    }
   
	public int size() {
 return size;
	}

	public void enqueue(T elem) {
		input.push(elem);
	}

	public T dequeue() {
		if(input.empty()==false) {
			return input.pop();
		}else {
			while(input.empty()==false) {
				output.push(input.pop());
			}
			return output.pop();
		}
	}
	
	public T top() {
		if(output.empty()==false) {
			return output.peek();
		}else {
		while(input.empty()==false) {
			output.push(input.peek());
		}
		return output.peek();
		}
		
	}

}
