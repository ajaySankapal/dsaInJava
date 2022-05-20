package k_binary_search_tree;

import j_binary_tree.BinaryTreeNode;

public class B_implementation {
	
	//insert in node
	
	public static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root, int data){
		if(root == null) {
			return new BinaryTreeNode<Integer>(data);
		}
		else if(root.data>=data) {
			root.left = insert(root.left,data);
		}else {
			root.right = insert(root.right,data);
		}
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
		
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = null;
		root = insert(root,25);
		root = insert(root,23);
		root = insert(root,32);
		root = insert(root,30);
		root = insert(root,26);
		root = insert(root,20);
		root = insert(root,22);
		root = insert(root,24);
		root = insert(root,19);
		printTreeDetailed(root);
	}

}
