package b_arrays;

public class G_reverse_array {

	public static int[] reverseArray(int[] arr) {
		int n = arr.length;
		int revArr[] = new int[n];
		for(int i = n-1,j=0;i>=0;j++,i--) {
			
				revArr[j] = arr[i];
			
		}
		return revArr;
	}
	
	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6};
        int reversedArr[] = reverseArray(arr);
        int i;
        for(i = 0;i<reversedArr.length;i++) {
        	 System.out.print(reversedArr[i]+" ");
        }
       
	}

}
