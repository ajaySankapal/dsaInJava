package yB_binary_search_algorithm;

public class B_binary_search_using_recursion {

	public static int binarySearchRecursion(int[] a, int start, int end, int x) {
		int mid = start+(end-start)/2;
		if(start>end) return -1;
		if(x==a[mid]) return mid;
		else if(x<a[mid]) {
			return binarySearchRecursion(a,start,mid-1,x);
		}
		else {
			return binarySearchRecursion(a, mid+1, end, x);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,4,5,9,15,18,21};
		int x = 5;
		int start = 0;
		int end = a.length - 1;
		System.out.println(binarySearchRecursion(a,start,end,x));


	}

}
