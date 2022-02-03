package b_arrays;

import java.util.Arrays;

public class K_array_in_increasing_decreasing_order {

	public static void sortArrayIncDecOrder(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		for(int i = 0;i<n/2;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i = n-1;i>=n/2;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,5,8,3,4,6,7};
		sortArrayIncDecOrder(arr);

	}

}
