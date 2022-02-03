package b_arrays;

public class H_average_of_elements_of_array {

	public static int average(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for(int i = 0; i<n;i++) {
			
			sum = sum+arr[i];
		}
		return sum/n;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,8,5,4,3,2,9};
		System.out.println(average(arr));

	}

}
