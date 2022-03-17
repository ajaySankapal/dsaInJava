package j_binary_tree;

//diameter of binary tree is maximum distance between to leaf nodes including that nodes
//distance b/w two farthest node

//https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1/
//prob stat: return diameter of the given binary tree

import java.util.Scanner;


public class O_diameter_of_binary_tree {

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
		
		//diameter of the binary-tree
		public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
			if(root == null) return 0;
			int option1 = height(root.left)+height(root.right); //time-comlexity is o(n*n) because first we are calculating height and then we are calculating the diameter
			int option2 = diameterOfBinaryTree(root.left);     //we can optimize our approach by calling height and diameter at the same time. for this->
			                                                   // make a class contains diameter and height, create object of that class and return that object
			int option3 = diameterOfBinaryTree(root.right);
			return Math.max(option1, Math.max(option2, option3));
		}
		//height of the binary tree
		public static int height(BinaryTreeNode<Integer> root) {
			if(root == null) return 0;
			return 1+ Math.max(height(root.left),height(root.right));
		}
		
		
		//diameter of binary tree improved
		//class for returning two values(height,diameter)
		public static class  Pair{
			int height;
			int diameter;
			public  Pair(int height, int diameter) {
				this.height = height;
				this.diameter = diameter;
			}
		}
		//
		public static Pair diameterBetterHelper(BinaryTreeNode<Integer> root) {
			if(root == null) {
				Pair pair = new Pair(0,0);   //if the root is null it is returning height = 0, diameter = 0;
				return pair;
			}
			Pair leftPair = diameterBetterHelper(root.left);  //asking diameter and height from the left subtree
			Pair rightPair = diameterBetterHelper(root.right); //asking diameter and height from the right subtree
			int leftDiameter = leftPair.diameter;    //abstracting diameter from the left and right subtree
			int rightDiameter = rightPair.diameter;
			int dist = leftPair.height+rightPair.height+1; //calculating distance. the max distance between the deepest node of left and right subtree 
			
			int diameter = Math.max(leftDiameter, Math.max(rightDiameter, dist)); //diameter is the maximum of the (left's diameter,right's diameter and max lh+rh)
			int height = Math.max(leftPair.height,rightPair.height)+1;
			return (new Pair(height,diameter));  //returning pair containing height and diameter
		}
		public static int diameterBetter(BinaryTreeNode<Integer> root) {
			Pair pair = diameterBetterHelper(root); //storing pair from the function in pair
			return pair.diameter; //returning diameter from that pair
		}
		
		
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
        System.out.println("Diameter of the binary tree is "+diameterOfBinaryTree(root));		

	}

}
