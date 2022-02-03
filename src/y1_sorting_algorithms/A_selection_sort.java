package y1_sorting_algorithms;

public class A_selection_sort {

	public static void selectionSort(int[] arr,int n) {
		 for (int i = 0; i < n-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[min_idx]) {
	                	   min_idx = j;	
	                }
	                 
	 
	            // Swap the found minimum element with the first
	            // element
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	                
	        }
	    
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int[] arr = {8,9,4,5,3,8,4};
	   int n = arr.length;
	   
	   selectionSort(arr,n);

	}

}
