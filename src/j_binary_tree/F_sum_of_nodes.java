package j_binary_tree;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/sum-of-binary-tree/1
//return sum of all nodes

//the algo is first we store the root data in sum and then recursively call for leftTree sum and rightTree sum and at last return sum+leftSum+rightSum


public class F_sum_of_nodes {



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
		
		//sum of nodes
		public static int sumOfNodes(BinaryTreeNode<Integer> root) {
			if(root == null) return 0;
			int sum = root.data;
			int leftSum = 0,rightSum = 0;
			if(root.left != null) {
				 leftSum = sumOfNodes(root.left);
			}
			if(root.right != null) {
				 rightSum = sumOfNodes(root.right);
			}
			return sum+leftSum+rightSum;
		}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
		System.out.println(sumOfNodes(root));

	}

}
