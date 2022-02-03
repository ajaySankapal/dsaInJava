package y_algorithms;

public class B_sliding_window_algorithm {

	//maximum sum of subarray of given window size
	public static int maxSumSubArrayOfWindowSizeBySlidingWindowAlgo(int arr[], int n,int k) {
		int window_sum = 0;
		int max = Integer.MIN_VALUE;
		
		// sum of elements of first window
		for(int i = 0; i<k;i++) {
			window_sum = window_sum + arr[i];
			max = window_sum;
		}
		
		//sliding window by 1 .... substracting prev element, adding next element
		for(int i = k; i<n-k+1;i++) {
			window_sum = window_sum+arr[i] - arr[i-k];
			max = Math.max(max, window_sum);
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12,6,8,-2,1,5,6};
		int n = arr.length;
		int k = 3;
		System.out.println(maxSumSubArrayOfWindowSizeBySlidingWindowAlgo(arr,n,k));

	}

}
