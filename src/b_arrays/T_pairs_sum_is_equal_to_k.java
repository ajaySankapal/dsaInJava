package b_arrays;

public class T_pairs_sum_is_equal_to_k {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,4,4,5};
		int n = arr.length;
		int k = 8;
		
		for(int i = 0; i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i]+arr[j] == k) {
					System.out.println(i+" "+j);
				}
			}
		}
		
		
		
	}

	}

