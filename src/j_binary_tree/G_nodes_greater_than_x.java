package j_binary_tree;

import java.util.Scanner;

public class G_nodes_greater_than_x {

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
	
	public static int nodesGreaterThanX(BinaryTreeNode<Integer> root,int x,int count) {
		if(root==null) return 0;
		
		int leftCount = nodesGreaterThanX(root.left,x,count);
		int rightCount = nodesGreaterThanX(root.right,x,count);
		
		return (root.data>x?1:0)+leftCount+rightCount;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputBetter(true,0,false);
		System.out.println(nodesGreaterThanX(root,4,0));

	}

}
