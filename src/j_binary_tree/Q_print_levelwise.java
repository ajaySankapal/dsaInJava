package j_binary_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q_print_levelwise {

	// take input levelwise
	public static BinaryTreeNode<Integer> takeInputLevelwise() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data ");
		int rootData = s.nextInt();
		if (rootData == -1)
			return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);
		while (!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildren.poll();
			System.out.println("Enter left child of " + front.data);
			int left = s.nextInt();
			if (left != -1) {
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
				front.left = leftChild;
				pendingChildren.add(leftChild);
			}
			System.out.println("Enter right child of " + front.data);
			int right = s.nextInt();
			if (right != -1) {
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
				front.left = rightChild;
				pendingChildren.add(rightChild);
			}
		}
		return root;

	}

	// print levelwise
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);
		while (!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChildren.poll();
				if(root == null) {
					System.out.println();
					if(!pendingChildren.isEmpty()) {
						pendingChildren.add(null);
					}
				}else {
					System.out.print(front.data+":L:");
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
		BinaryTreeNode<Integer> root = takeInputLevelwise();
		printLevelWise(root);

	}

}
