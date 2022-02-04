package yB_binary_search_algorithm;
//https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1#
//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class F_search_element_in_circular_sorted_array {

	public static int searchInCircularSortedArray(int[] a,int n,int x) {
		int low = 0;
		int high = n-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(a[mid] == x) return mid;
			if(a[mid] <= a[high] ) {
				if(x <= a[high] && x> a[mid]) {
					low = mid+1;
				}else {
					high = mid-1;
				}
			}else {
				if(x>=a[low] && x<a[high]) {
					high = mid-1;
				}
				else {
					low = mid+1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {13,12,11,8,9,10};
		int n = a.length;
		int x = 10;
	System.out.println(searchInCircularSortedArray(a,n,x));	

	}

}
