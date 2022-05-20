package j_binary_tree;

import java.util.Scanner;

public class A_take_input_of_binary_tree {

	public static BinaryTreeNode<Integer> takeInput(){
	
		System.out.println("enter root data:");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> rootLeft = takeInput();
		BinaryTreeNode<Integer> rootRight = takeInput();
		root.left = rootLeft;
		root.right = rootRight;
		
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
		BinaryTreeNode<Integer> root = takeInput();
        printTreeDetailed(root);		

	}

}
