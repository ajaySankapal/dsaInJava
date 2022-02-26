package h_stacks;

import java.util.Stack;

public class A_basics_of_stacks {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		System.out.println(stack);

	}

}


//LIFO : last in first out
//push() to insert the element at the top
//pop() to remove the element from the top
//top() to peek the element which is at the top
//size() to know the size of the stack
//isEmpty() to know whether the stack is empty or not
//we only can add the elements at the top and can only remove from the top