package j_binary_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//what we are doing until now is that we are taking roots data and then we are taking leftSubTree data and after completion of taking data from the left then we are asking for rightSubTree data
//we are using recursion for these
//now we are thinking of taking the inputs levelwise
//in levelwise we ask for the childs of the nodes which came first
//         1
//      /    \
//     2      3
//    / \    / \
//   5   6  7   8
// first node(the root node) is 1
// then we ask for root's left child and right child 2,3
// then we ask for 2's left,right child 5,6
//then 3's left,right child 7,8
// then 5,6,7,8's left,right child -1,-1,-1,-1,-1,-1,-1,-1
//to solve this problem we can't use recursion, we have to use iteration

//1. take root input
//2. insert it into a queue
//3. while the queue is not empty
    //1. take the first element out 
    //2. ask for its left child 
        //if the left != -1, attach it to this elements left side and push left to the queue
    //3. ask for its right child 
        // if the right != -1 attach it to this elements right side and push right to the queue

public class P_level_wise_input {

	public static BinaryTreeNode takeInputLevelwise() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root Data ");
		int rootData = s.nextInt();
		if(rootData == -1) return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);
		while(!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildren.poll();
		    System.out.println("Enter left child of "+front.data);
		    int left = s.nextInt();
		    if(left != -1) {
		    	BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
		    	front.left = leftChild;
		    	pendingChildren.add(leftChild);
		    }
		    System.out.println("Enter right child of "+front.data);
		    int right = s.nextInt();
		    if(right != -1) {
		    	BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
		    	front.right = rightChild;
		    	pendingChildren.add(rightChild);
		    }
		}
		return root;
	}
	
	//printTreeDetailed
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+":");
		if(root.left != null) {
			System.out.print("L"+root.left.data);
		}
		if(root.right != null) {
			System.out.print(",R"+root.right.data);
		}
		System.out.println("");
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputLevelwise();
		printTreeDetailed(root);

	}

}
