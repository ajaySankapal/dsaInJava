package y1_sorting_algorithms;

public class C_insertion_sort {

	public static void  insertionSort(int[] arr,int n) {
		for(int i = 1; i<n;i++) {
			int value = arr[i];
			int hole = i;
			while(hole>0 && arr[hole-1] > value) {
				arr[hole] = arr[hole-1];
				hole = hole-1;
			}
			arr[hole] = value;
		}
		for(int i = 0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {21,20,18,9,4,5,3,8,4};
		   int n = arr.length;
		   
		   insertionSort(arr,n);
	}

}
