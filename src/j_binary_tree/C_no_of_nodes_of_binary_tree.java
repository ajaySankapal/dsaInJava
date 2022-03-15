package j_binary_tree;

import java.util.Scanner;

public class C_no_of_nodes_of_binary_tree {

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
		
		//count number of nodes
//		static int count = 0;
//		public static int countNodes(BinaryTreeNode<Integer> root) {
//			
//			if(root == null) {
//				return 0;
//			}
//			count++;
//			countNodes(root.left);
//			countNodes(root.right);
//			
//			return count;
//		}
		
		public static int countNodes(BinaryTreeNode<Integer> root) {
			if(root == null) return 0;
			int leftNodes = countNodes(root.left);
			int rightNodes = countNodes(root.right);
			return 1+leftNodes+rightNodes; //this 1+ is the key 
		}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
		System.out.println(countNodes(root));

	}

}
