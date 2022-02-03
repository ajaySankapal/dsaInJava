package b_arrays;

public class I_second_smallest_largest {

	public static void secondSmallestAndLargest(int[] arr) {
		int n = arr.length;
		int small = Integer.MAX_VALUE;
		int large = Integer.MIN_VALUE;
		int second_small = Integer.MAX_VALUE;
		int second_large = Integer.MIN_VALUE;
		if(n == 0 || n == 1) {
			System.out.println("-1");
		}
		for(int i = 0; i<n ; i++) {
		
		small = Math.min(small, arr[i]);
	  
	    large =   Math.max(large, arr[i]);
	    
		}
		for(int i = 0; i<n;i++) {
			if(arr[i]<second_small && arr[i] != small) {
				second_small = arr[i];
			}
			if(arr[i]>second_large && arr[i] != large) {
				second_large = arr[i];
			}
		}
		System.out.println("second smallest number is "+second_small);
		System.out.println("second largest number is "+second_large);
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,6,8,4,9,10,1,7};
		secondSmallestAndLargest(arr);

	}

}
