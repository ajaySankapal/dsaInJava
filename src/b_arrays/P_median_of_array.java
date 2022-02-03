package b_arrays;

import java.util.Arrays;

public class P_median_of_array {
	
	public static void median(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		int ind1 = (n/2)-1;
		int ind2 = (n/2);
		if(n%2 !=0) {
		System.out.println(arr[n/2]);
		}
		else{
		 System.out.println((double)(arr[ind1]+arr[ind2])/2);  
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 3, 4, 2, 6, 5, 8, 7};
		median(arr);

	}

}
