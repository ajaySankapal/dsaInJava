package b_arrays;

public class R_window_sliding_algorithm_max_sum_subarray {

	
	static int maxSumSubArray(int arr[],int N,int K){
        // code here
        int max = Integer.MIN_VALUE;
        int window_sum = 0;
        
        for(int i = 0; i<K;i++){
            window_sum += arr[i];
        }
        max = window_sum;
        for(int i = K;i<N;i++){
          window_sum = window_sum+arr[i]-arr[i-K];  
          max = Math.max(max,window_sum);
        }
      
       return max; 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,3,9,4,8,-2,1,5};
		int n = arr.length;
		int k = 3;
		System.out.println(maxSumSubArray(arr,n,k));
	}

}
