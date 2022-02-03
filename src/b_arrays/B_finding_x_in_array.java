package b_arrays;

public class B_finding_x_in_array {

	public static int findElement(int arr[],int x) {
		for(int i = 0; i<arr.length;i++) {
			if(x == arr[i]) {
				return i;
			}
				
		}
	return -1;	
	}
	
	public static void main(String[] args) {
		
  int arr[] = {1,8,4,9,10,5,7};
  System.out.println(findElement(arr,10));
	}

}
