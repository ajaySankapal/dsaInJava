package j_binary_tree;

import java.util.Scanner;

//a tree is said to be balanced if the ||(height of left subtree) - (height of right subtree)|| <=1  this condition should satisfied at every node of the tree

//approach: 1. find height of the left and right subtree.
//          2. check at the root if the height of  left subtree - height of right subtree is less than equal to 1

//we are checking the balance condition at each node of the tree 

//time complexity: if the tree is balanced -> Kn+2T(n/2) --> o(nlogn)
//  		     : if the tree is not balanced -> kn+T(n-1) --> o(n*n)

//height of the balanced tree is logn and height of the unbalanced tree is n so the timecomplexity is just o(n*h) where h is height

public class N_check_if_tree_is_balanced_or_not {
	
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
	
		//check if the tree is balanced or not
		public static boolean isBalanced(BinaryTreeNode<Integer> root) {
			if(root == null) return true;
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);
			if(Math.abs(leftHeight-rightHeight)>1) {
				return false;
			}
			boolean isLeftBalanced = isBalanced(root.left);   //we are checking at each node if the tree is balanced or not
			boolean isRightBalanced = isBalanced(root.right);
			return isLeftBalanced && isRightBalanced;
		} 
		
		//height of the tree
		public static int height(BinaryTreeNode<Integer> root) {
			if(root == null) return 0;
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);
			return 1+Math.max(leftHeight, rightHeight);
		}
		
    public static void main(String args[]) {
    	BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
    	System.out.println("isBalanced "+isBalanced(root));
    }
}
