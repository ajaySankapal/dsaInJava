package yB_binary_search_algorithm;
//array must be sorted
//
public class C_find_first_and_last_occurence {

	public static int binarySearch(int[] a,int n, int x) {
		int start = 0;
		int end = n-1;
		int mid;
		int result = -1;
		while(start<=end) {
			mid = (start+end)/2;
			if(a[mid] == x) {
				result = mid;
//                end = mid-1;  //to print the first occurence  update end with mid-1;
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
		int a[] = {1,2,4,10,10,10,15,18,21};
		int x = 10;
		int n = a.length;
		System.out.println(binarySearch(a,n,x));

	}

}
