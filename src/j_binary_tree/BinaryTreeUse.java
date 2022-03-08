package j_binary_tree;

public class BinaryTreeUse {

	// print tree using recursion
	public static void printTree(BinaryTreeNode<Integer> root) {
//		System.out.println(root.data);
//		printTree(root.left);
//		printTree(root.right);
//		// Cannot read field "data" because "root" is null: if we dont handle the base
//		// case it will give us null pointer exception, because somewhere we reach to
//		// the point where root becomes null and we are trying to print the data of the null
	
//		if(root==null) {
//			return;
//		}
//		System.out.println(root.data);
//		printTree(root.left);
//		printTree(root.right);
		
		//
		if(root==null) {
			return ;
			
		}
		System.out.print(root.data+":" );
		if(root.left != null) {
			System.out.print("L"+root.left.data);
		}
		if(root.right != null) {
			System.out.print(",R"+root.right.data);
		}
		System.out.println("");
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
		root.left = rootLeft;
		root.right = rootRight;
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
//		rootLeft.right = twoRight;
//		rootRight.left = threeLeft;

		// printTree
		printTree(root);
	}

}
