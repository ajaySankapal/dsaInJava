package j_binary_tree;

import java.util.Scanner;

//what we are doing prior was calculating left and right height and then we are checking if the left and right is balanced or not. this is taking o(n*n) time
//to optimize this solution what if we check the height and isBalanced at the same time then our problem will be solved in the o(n) time
//so now we have to define a function which will return us two values the (leftHeight/RightHeight) and isBalanced;
//but function can return only one value, to overcome this we define a class which will contains two values and we have to make the object of that class and return that


public class N_isBalanced_better {

	public static class BalancedTreeReturn{
	int height;
	boolean isBalanced;
	}
	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {     //handling the base case,if the root becomes null then the height is zero, isBalanced is true; we are making object of the class and assigning the values
			int height = 0;
			boolean isBal = true;
			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}
		BalancedTreeReturn leftOutput = isBalancedBetter(root.left);  //storing output from the left subtree
		BalancedTreeReturn rightOutput = isBalancedBetter(root.right); //storing the output from the right subtree
		boolean isBal = true;  //initially considering the tree is balanced
		int height = 1+Math.max(leftOutput.height, rightOutput.height);  //calculating heigh of the tree
		if(Math.abs(leftOutput.height-rightOutput.height)>1) { //checking the condition of the tree to be balanced. if the height diff is greater than 1 then we are updating isBal to be false;
			isBal = false;
		}
		if(!leftOutput.isBalanced || !rightOutput.isBalanced) { //if any of the subtree is not balanced then also we are updating the val of isBal to be false;
			isBal = false;
		}
		BalancedTreeReturn ans = new BalancedTreeReturn(); //making object of the class and assigning the val's we calculated and at last returning that object
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
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
     
		BinaryTreeNode<Integer> root = takeInputBetter(true, 0, false);
		System.out.println("isBalanced "+isBalancedBetter(root).isBalanced);

	}

}
