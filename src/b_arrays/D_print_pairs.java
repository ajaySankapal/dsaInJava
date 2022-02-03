package b_arrays;

public class D_print_pairs {
   
	public static void printPairs(int[] arr) {
		int n = arr.length;
		int i = 0;
		int j = 0;
		for(i = 0;i<n-1;i++) {
			for(j = i+1;j<arr.length;j++) {
				System.out.println(arr[i]+","+arr[j]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {4,8,7,5,6,9};
		printPairs(arr);

	}

}
