package j_binary_tree;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/mirror-tree/1
//prob stat: Given a Binary Tree, convert it into its mirror.

public class M_mirror_binary_tree {

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
	
	//mirror binary tree
	public static void mirrorBinaryTreeHelper(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		if(root.left != null  && root.right != null) {
			int l_temp = root.left.data;
			root.left.data = root.right.data;
			root.right.data = l_temp;
		}
		
		mirrorBinaryTreeHelper(root.left);
		mirrorBinaryTreeHelper(root.right);
	}
	
	
	public static BinaryTreeNode<Integer> mirrorBinaryTree(BinaryTreeNode<Integer> root){
		mirrorBinaryTreeHelper(root);
		return root;
	}
	
	//mirror of binary tree
		public static void  mirror(BinaryTreeNode<Integer> root) {
			if(root == null) return;
			mirror(root.left);
			mirror(root.right);
			BinaryTreeNode<Integer> l_temp = root.left;
			root.left = root.right;
			root.right = l_temp;
			printTreeDetailed(root);
		}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
//		root = mirrorBinaryTree(root);
//		printTreeDetailed(root);
		mirror(root);

	}

}
