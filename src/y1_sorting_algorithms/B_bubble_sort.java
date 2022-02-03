package y1_sorting_algorithms;

public class B_bubble_sort {

	public static void bubbleSort(int[] arr,int n) {
		for(int k = 1; k<n-1;k++) {
			for(int i = 0;i<n-1;i++) {
				if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				}
			}
		}
		
		for(int  i = 0; i< n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {20,18,9,4,5,3,8,4};
		   int n = arr.length;
		   
		   bubbleSort(arr,n);

	}

}
