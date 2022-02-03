package b_arrays;

public class U_kadanes_algorithm_max_sum_subarray {

	public static int maxSumSubArray(int[] arr,int n) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0; i<n;i++) {
			sum = sum+arr[i];
			if(max<sum) {
				max = sum;
			}
			if(sum<0) {
				sum = 0;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,8,9,-2,-1,1};
		int n = arr.length;
	System.out.println(maxSumSubArray(arr,n));	

	}

}
