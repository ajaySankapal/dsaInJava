package j_binary_tree;

import java.util.Scanner;

public class B_take_input_better {

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
	}

}
