package k_binary_search_tree;

import java.util.Scanner;

import j_binary_tree.BinaryTreeNode;

public class InsertNode {

	// insert data in bst
	public static BinaryTreeNode<Integer> insertNode(BinaryTreeNode<Integer> root, int data) {
		BinaryTreeNode<Integer> cur = root;
		// storing the root bcz we have to return it, and by traversing we will lose
		// track of the root, so we store it
		if (root == null) {
			return new BinaryTreeNode<Integer>(data);
			// if the root is null we have to make a new node of the data and return it;
		}
		while (true) {
			if (cur.data <= data) {
				// if the root's data is less than the data, then we have to insert the node in
				// the right side only
				if (cur.right != null) {
					// we want to insert the node when our path is halted
					//	(means if we encounter the node which is null, there we have to insert the node, untill then we shift our pointer to right)
					cur = cur.right;
				} else {
					//if our root becomes that is the only place we have to insert the new node, so we make that root's right to the newNode
					cur.right = new BinaryTreeNode<Integer>(data);
					break;
				}
			} else {
				if (cur.left != null) {
					cur = cur.left;
				} else {
					cur.left = new BinaryTreeNode<Integer>(data);
					break;
				}
			}
		}
		//at last we return the root
		return root;
	}

	// print detailed tree
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data);
		}
		if (root.right != null) {
			System.out.print(",R" + root.right.data);
		}
		System.out.println("");
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}

	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parentData, boolean isleft) {
		if (isRoot) {
			System.out.println("Enter root data:");
		} else {
			if (isleft) {
				System.out.println("enter left child of:" + parentData);
			} else {
				System.out.println("enter right child of:" + parentData);
			}
		}
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeInputBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeInputBetter(false, rootData, false);
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
		BinaryTreeNode<Integer> newRoot = insertNode(root, 5);
		printTreeDetailed(newRoot);

	}

}
