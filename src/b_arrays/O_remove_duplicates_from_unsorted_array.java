package b_arrays;

public class O_remove_duplicates_from_unsorted_array {

	public static void duplicate(int[] arr,int n) {
		boolean mark[] = new boolean[n];
		for(int i = 0; i<n;i++) {
			mark[i] = false;
		}
		for(int i = 0;i<n-1;i++) {
			if(arr[i] == arr[i+1]) {
				mark[i] = true;
			}
		}
		for(int i = 0;i<n;i++) {
			if(mark[i] == false) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {5,5,5,4,4,4,8,9,6,54,7,7,7};
		int n = arr.length;
      duplicate(arr,n);
	}

}
