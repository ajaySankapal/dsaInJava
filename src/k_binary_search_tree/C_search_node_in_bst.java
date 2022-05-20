package k_binary_search_tree;

import java.util.Scanner;

import j_binary_tree.BinaryTreeNode;

public class C_search_node_in_bst {
	
	
	//search node in binary search tree
	public static BinaryTreeNode<Integer> findNode(BinaryTreeNode<Integer> root,int data){
		BinaryTreeNode<Integer> cur = root;
		if(root == null) {
			return new BinaryTreeNode<Integer>(data);
		}
		while(true) {
			if(cur.data <= data) {
				if(cur.right != null) {
					cur = cur.right;
				}else {
					cur.right = new BinaryTreeNode<Integer>(data);
					break;
				}
			}else {
				if(cur.left != null) {
					cur = cur.left;
				}else {
					cur.left = new BinaryTreeNode<Integer>(data);
					break;
				}
			}
		}
		return root;
	}
	
	//search node in bst return true or false
	public static boolean search(BinaryTreeNode<Integer> root,int data) {
		if(root == null) return false;
		if(root.data == data) {
			return true;
		}else if(root.data < data) {
			return search(root.left,data);
		}else {
			return search(root.right,data);
		}
	}

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
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
		printTreeDetailed(root);
		System.out.println(findNode(root,4));
		System.out.println(search(root,1));

	}

}
