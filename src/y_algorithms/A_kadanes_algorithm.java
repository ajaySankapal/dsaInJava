package y_algorithms;

public class A_kadanes_algorithm {

	//kadanes algorithm
	// maximum sum subarray
	
	public static int maxSumSubArray(int arr[],int n) {
		int max = Integer.MIN_VALUE;
		int sum =0;
		for(int i = 0; i<n;i++) {
			sum = sum + arr[i];
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
		int arr[] = {1,-2,7,8,9,-2,-1,1};
		int n = arr.length;
	System.out.println(maxSumSubArray(arr,n));	

	}

}
