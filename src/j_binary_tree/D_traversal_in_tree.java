package j_binary_tree;

import java.util.Scanner;

//traversal in binary tree can be classified in two categories
    //1. Breadth-first-traversal (level order) --> search through a tree one level at a time
        //traverse through one level of children nodes, then traverse through the level of grandchildren(and so on..)

    //2. Depth-first-traversal   (inorder,preorder,postorder)
        //traverse thorough the left subtree first and then right subtree.



//preorder: root-> left -> right
//          1
//         / \
//        2  3
//      /  \
//     5    4
//o/p: 1,2,5,4,3

//postorder: leftchild -> rightChild -> root
///o/p: 5,4,2,3,1

//inorder traversal: left -> root -> right
//o/p: 5,2,4,1,3

//levelwise traversal
//o/p: 1,2,3,5,4
public class D_traversal_in_tree {

	//preorder traversal
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if(root==null) return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//postOrder traversal
	public static void postOrder(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}
	
	//inOrder traversal
	public static void inOrder(BinaryTreeNode<Integer> root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}
	
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
	public static void main(String[] args) {
    BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
//    preOrder(root);
//    postOrder(root);
      inOrder(root);
	}

}
