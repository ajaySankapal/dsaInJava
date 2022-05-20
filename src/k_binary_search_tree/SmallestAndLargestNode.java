package k_binary_search_tree;

import java.util.Scanner;

import j_binary_tree.BinaryTreeNode;


public class SmallestAndLargestNode {
	public static class SLReturn{
		int smallest;
		int largest;
	}

	//find smallest and larget element in bst
	public static SLReturn findSmallestAndLargest(BinaryTreeNode<Integer> root) {
		if(root == null) {
			int smallest = 0;
			int largest = 0;
			SLReturn ans = new SLReturn();
			ans.smallest = smallest;
			ans.largest = largest;
			return ans;
		}
		BinaryTreeNode<Integer> cur = root;
		int smallest = 0;
		int largest = 0;
		while(true) {
			if(cur.left != null) cur = cur.left;
			else {
				 smallest = cur.data;
                 break;	
			}
			if(cur.right != null) cur = cur.right;
			else {
				 largest = cur.data; 
				 break;
			}
		}
		SLReturn ans = new SLReturn();
		ans.smallest = smallest;
		ans.largest = largest;
		return ans;
	}
	//take input of the bst
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
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
		System.out.println("Smallest: "+findSmallestAndLargest(root).smallest+" largest: "+findSmallestAndLargest(root).largest);

	}

}
