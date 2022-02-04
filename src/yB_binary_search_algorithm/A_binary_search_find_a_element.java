package yB_binary_search_algorithm;
//array must be sorted
//
public class A_binary_search_find_a_element {

	public static int binarySearch(int[] a,int n, int x) {
		int start = 0;
		int end = n-1;
		int mid;
		while(start<=end) {
			mid = (start+end)/2;
			if(a[mid] == x) {
				return mid;
			}
			else if(x<a[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,4,5,9,15,18,21};
		int x = 18;
		int n = a.length;
		System.out.println(binarySearch(a,n,x));

	}

}
