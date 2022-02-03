package b_arrays;

public class N_remove_duplicates {

//	public static int[] removeDuplicates(int[] arr,int n) {
//		int temp[] = new int[n];
//		int res = 1;
//		temp[0] = arr[0];
//		for(int i = 1;i<n;i++) {
//			if(temp[res-1] != arr[i]) {
//				temp[res] = arr[i];
//				res++;
//			}
//			
//			
//		}
//		for(int i = 0;i<res;i++) {
//			arr[i] = temp[i];
//		}
//		
//		
//		return arr;
//	}
	
	//remove duplicates method
	public static int removeDuplicates(int[] arr, int n) {
		int size = 1;
		for(int i = 1; i<n-1; i++) {
			if(arr[i] != arr[size-1]) {
				arr[size]=arr[i];
				size++;
			}
		}
		return size;
	}
	
	public static void main(String[] args) {		
//		int arr[] = {1,1,1,2,5,5};
//		int n = arr.length;
//		int arr2[] = removeDuplicates(arr,n);
//		
//		for(int i = 0;i<n;i++) {
//			System.out.print(arr2[i]+" ");
//		}
		
		
//remove duptlicates from sorted array
		int arr[] = {1,1,1,2,2,5,5};
		int n = arr.length;
		System.out.println(removeDuplicates(arr,n));

	}

}
