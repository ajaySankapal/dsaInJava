package b_arrays;

public class V_find_all_non_repeating_elements {

	public static void  findAllRepeating(int arr[], int n) {
		boolean check;
		for(int i = 0; i<n;i++) {
			check = false;
			for(int j = 0; j<n ; j++) {
				if(i != j && arr[i] == arr[j]) {
					check = true;
					break;
				}
				
			}
			if(!check) {
				System.out.print(arr[i]+" ");
			}
		}
		
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,8,2,3,4,4,1,1};
		int n = arr.length;
	    findAllRepeating(arr,n);

	}

}
