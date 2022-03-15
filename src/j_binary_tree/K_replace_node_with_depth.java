package j_binary_tree;

import java.util.Scanner;

public class K_replace_node_with_depth {

	// takeInputBetter
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

	// replace node with depth
	public static void replaceWithDepth(BinaryTreeNode<Integer> root, int k) {
		if (root == null)
			return;
		replaceWithDepth(root.left, k + 1);
		System.out.println(k);
		replaceWithDepth(root.right, k + 1);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
		replaceWithDepth(root, 0);

	}

}
