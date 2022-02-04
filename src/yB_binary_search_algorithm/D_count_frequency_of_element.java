package yB_binary_search_algorithm;
//array must be sorted
//https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1/
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
public class D_count_frequency_of_element {

	public static int binarySearch(int[] a,int n, int x,boolean searchFirst) {
		int start = 0;
		int end = n-1;
		int mid;
		int result = -1;
		while(start<=end) {
			mid = (start+end)/2;
			if(a[mid] == x) {
				result = mid;
				if(searchFirst)
                   end = mid-1;  //to print the first occurence  update end with mid-1;
				else 
				  start = mid+1;
			}
			else if(x<a[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,4,10,10,10,10,15,18,21};
		int x = 10;
		int n = a.length;
		int firstIndex = binarySearch(a,a.length,x,true);
		if(firstIndex == -1) {
			System.out.println(0);
		}
		else {
		int	lastIndex = binarySearch(a, n, x, false);
		int count = lastIndex - firstIndex +1;
		System.out.println(count);
		}
      ;
	}

}
