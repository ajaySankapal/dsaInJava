package b_arrays;

public class Q_window_sliding_algorithm {

//brute force solution
//	public static int maxSumSubArray(int arr[],int n, int k) {
//		int max = Integer.MIN_VALUE;
//		
//		for(int i = 0;i<n-k+1;i++) {
//			int sum = 0;
//			for(int j = 0;j<k;j++) {
//				sum = sum+arr[i+j];
//			}
//		max=Math.max(max, sum);
//		}
//		return max;
//	}
	
	//sliding window algorithm : to print the min sum subarray
	public static void minSumSubArray(int arr[],int n, int k) {
		//sum of first window elements
		int current_sum = 0;
		for(int i = 0;i<k;i++) {
			current_sum = current_sum+arr[i];
		}
		
		int window_sum = current_sum;
		int minLastIndex = k-1;
		for(int i = k; i<n;i++) {
			current_sum = current_sum+arr[i]-arr[i-k];
			if(current_sum<window_sum) {
				window_sum = current_sum;
				minLastIndex = i;
			}
		}
			int startIndex = minLastIndex-k+1;
			int endIndex = minLastIndex;
			
			
			for(int j = startIndex;j<=endIndex;j++) {
				System.out.print(arr[j]+" ");
			}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-1,3,4,4,8,-2,1,5};
		int n = arr.length;
		int k = 3;
		minSumSubArray(arr,n,k);

	}

}
