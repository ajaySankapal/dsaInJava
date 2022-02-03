package b_arrays;

public class S_frequency_of_k {
	
	public static int frequency(int arr[],int n,int k) {
		int count = 0;
		for(int i = 0; i<n;i++) {
			if(arr[i] == k) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1,3,4,4,4,8,-2,1,5};
		int n = arr.length;
		int k = 4;
		   System.out.println(frequency(arr,n,k));

	}

}
