package y_algorithms;

public class C_dutch_national_flag_algorithm {
	
	//dutch national flag algorithm
	public static void sortByDutchNationalFlag(int arr[],int n) {
		int low = 0;
		int mid = 0;
		int high = n-1;
		int temp;
		while(mid<=high) {
			switch(arr[mid]) {
			case 0:
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				mid++;
				low++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
				
			}
		}
		for(int i = 0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {2,0,1,1,2,0,2,1,1};
        int n = arr.length;
        sortByDutchNationalFlag(arr,n);
	}

}
