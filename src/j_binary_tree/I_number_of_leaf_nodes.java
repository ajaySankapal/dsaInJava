package j_binary_tree;

import java.util.Scanner;

//leaf:  nodes which dont have any child
//https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1/
public class I_number_of_leaf_nodes {

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
	
	//number of leaves
	public static int numOfLeaves(BinaryTreeNode<Integer> root) {
		if(root == null) return 0;
		if(root.left == null && root.right == null) return 1;  //if the left and right of any node becomes null it means it don't have any child so it is our leaf and we return 1
		return numOfLeaves(root.left)+numOfLeaves(root.right);
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
       System.out.println("num of leaves: "+numOfLeaves(root));
	}

}
