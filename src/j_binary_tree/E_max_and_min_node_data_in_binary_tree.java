package j_binary_tree;

import java.util.Scanner;

public class E_max_and_min_node_data_in_binary_tree {

	

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
    //largest node
	public static int findMax(BinaryTreeNode<Integer> root) {
		
		if(root == null) return 0;
		int max = root.data;
		int leftMax,rightMax;
		if(root.left != null) {
			leftMax = findMax(root.left);
			max = Math.max(max, leftMax);
		}
		if(root.right != null) {
			 rightMax = findMax(root.right);
			 max = Math.max(max,rightMax);
		}
		return max;
	}
	
	public static int findMin(BinaryTreeNode<Integer> root) {
		if(root==null) return 0;
		int min = root.data;
		int leftMin,rightMin;
		if(root.left != null) {
			leftMin = findMin(root.left);
			min = Math.min(min, leftMin);
		}
		if(root.right != null) {
			rightMin = findMin(root.right);
			min = Math.min(min, rightMin);
		}
		return min;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
//		System.out.println(findMax(root));
		System.out.println(findMin(root));
       
	}
}
