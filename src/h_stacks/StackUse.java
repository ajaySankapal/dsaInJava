package h_stacks;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		//if we want to give user the permission to define the size of the stack
		
//		StackUsingArray stack = new StackUsingArray();
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(10);
//		stack.push(20);
////	    System.out.println(stack.isEmpty());
//	    System.out.println(stack.size());
////	    System.out.println(stack.top());
//	    System.out.println(stack.pop());
//	    System.out.println(stack.size());
		StackUsingLL<Integer> st = new StackUsingLL<>();
		int[] nums = {1,2,3,4,5};
		for(int i = 0; i<nums.length;i++) {
			st.push(nums[i]);
		}
		for(int i = 0; i<nums.length;i++) {
			System.out.println(st.pop());
		}
	}
}
