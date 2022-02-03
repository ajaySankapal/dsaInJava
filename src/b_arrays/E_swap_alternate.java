package b_arrays;

public class E_swap_alternate {

	public static int[] swapAlternate(int[] arr) {
		int n = arr.length;
		int i = 0;
		while(i<n) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			i = i+2;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,5,7,9,6,8};
		int swappedArray[] = swapAlternate(arr);
		for(int i = 0; i<swappedArray.length;i++) {
			System.out.print(swappedArray[i]+" ");
		}

	}

}
