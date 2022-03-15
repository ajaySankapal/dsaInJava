package j_binary_tree;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1/
//prob stat: given a binary tree find its height 


public class H_height_of_binary_tree {

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
			
			//height of binary tree
			static int height = 0;
			public static int heightOfTree(BinaryTreeNode<Integer> root) {
				
				if(root==null) return 0;
				int leftHeight = heightOfTree(root.left);
				int rightHeight = heightOfTree(root.right);
				int maxHeight = Math.max(leftHeight, rightHeight);
				return 1+maxHeight;
			}
			
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
        System.out.println(heightOfTree(root));
	}

}
