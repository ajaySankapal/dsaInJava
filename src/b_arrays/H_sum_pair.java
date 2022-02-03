package b_arrays;

public class H_sum_pair {
public static int[] sumPair(int[] arr,int x) {
		
		int n = arr.length;
		int pair[] = new int[2];
		for(int i = 0;i<n-1;i++) {
			for(int j = i+1; j<n;j++) {
				if(arr[i]+arr[j] == x) {
					pair[0] = i;
					pair[1] = j;
				}
			}
		}
		return pair;
	}

	public static void main(String[] args) {
		int arr[] = {1,5,1,7};
		int x = 8;
		
		int pairedSum[]= sumPair(arr,x);
		for(int i = 0; i<pairedSum.length;i++) {
			System.out.println(pairedSum[i]);
		}
		

	}

}
