package b_arrays;

public class J_sort_array {

	public static int[] sort(int[] arr) {
		
		int n = arr.length;
		for(int i = 1;i<n;i++) {
			int current = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > current) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
    
		int arr[] = {1,5,6,-1,7,9,4,23,5};
		int sortedarr[] = sort(arr);
		for(int i = 0;i<sortedarr.length;i++) {
			System.out.print(sortedarr[i]+" ");
		}
		
		
	}

}
