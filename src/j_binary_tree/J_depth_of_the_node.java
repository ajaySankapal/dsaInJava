package j_binary_tree;

import java.util.Scanner;

//depth: distance of the node from the root
//prob stat: print all nodes at the depth k

public class J_depth_of_the_node {

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
	
	//nodes at depth k
	public static void nodesAtDepthK(BinaryTreeNode<Integer> root,int k) {
		if(root == null) return;
		if(k == 0) System.out.println(root.data);
		nodesAtDepthK(root.left,k-1);
		nodesAtDepthK(root.right,k-1);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
		nodesAtDepthK(root,2);
		

	}

}
