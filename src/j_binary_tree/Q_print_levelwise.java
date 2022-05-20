package j_binary_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q_print_levelwise {

	// take input levelwise
//	public static BinaryTreeNode<Integer> takeInputLevelwise() {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter root data ");
//		int rootData = s.nextInt();
//		if (rootData == -1)
//			return null;
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
//		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
//		pendingChildren.add(root);
//		while (!pendingChildren.isEmpty()) {
//			BinaryTreeNode<Integer> front = pendingChildren.poll();
//			System.out.println("Enter left child of " + front.data);
//			int left = s.nextInt();
//			if (left != -1) {
//				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
//				front.left = leftChild;
//				pendingChildren.add(leftChild);
//			}
//			System.out.println("Enter right child of " + front.data);
//			int right = s.nextInt();
//			if (right != -1) {
//				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
//				front.left = rightChild;
//				pendingChildren.add(rightChild);
//			}
//		}
//		return root;
//
//	}
	
	//takeInputBetter
	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot,int parentData,boolean isleft){
		
	if(isRoot) {
		System.out.println("Enter root data:");
	}
	else {
		if(isleft) {
			System.out.println("enter left child of:"+parentData);
		}else {
			System.out.println("enter right child of:"+parentData);
		}
	}
	
	
	Scanner s = new Scanner(System.in);
	int rootData = s.nextInt();
	if(rootData == -1) {
		return null;
	}
	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
	BinaryTreeNode<Integer> leftChild = takeInputBetter(false,rootData,true);
	BinaryTreeNode<Integer> rightChild = takeInputBetter(false,rootData,false);
	root.left = leftChild;
	root.right = rightChild;
	return root;
	}


	// print levelwise
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);  //addint the first node to the queue
		while (!pendingChildren.isEmpty()) {   // run the loop till queue becomes empty
			BinaryTreeNode<Integer> front = pendingChildren.poll(); //taking out that node from the queue
				if(root == null) {
					System.out.println(); //if root is null print nothing
					if(!pendingChildren.isEmpty()) {
						pendingChildren.add(null);
					}
				}else {
					System.out.print(front.data+":L:"); //after adding the node to the queue take that node(poll()) and print its data and check for its left and right
					if(front.left != null) {
						pendingChildren.add(front.left);
						System.out.print(front.left.data+",R:");
					}else {
						System.out.print(-1+",R:");
					}
					if(front.right != null) {
						pendingChildren.add(front.right);
						System.out.println(front.right.data);
					}else {
						System.out.println(-1);
					}
				}
				
		}
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
		printLevelWise(root);

	}

}
