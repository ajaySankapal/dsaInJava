package b_arrays;

public class A_largest_element {

	//function to find the largest element of array
	public static int findLargest(int [] arr) {
		int n = arr.length;
		int max =arr[0];
		for(int i = 1;i<n;i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
			max = Math.max(max, arr[i]);
				
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {5,9,7,5,8,185,78,58,99,1};
		System.out.println(findLargest(arr));

	}

}
