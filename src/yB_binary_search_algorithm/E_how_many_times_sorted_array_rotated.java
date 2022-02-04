package yB_binary_search_algorithm;

public class E_how_many_times_sorted_array_rotated {

	//brute force approach O(n) time complexity
   public static int noOfRotation(int[] a, int n){
	   int minIndex = 0;
	   int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			
			
			    if(a[i]<min) {
			    	min = a[i];
			    	minIndex = i;
			    }
		}
		return minIndex;
	}
   
   
   //optimized approach by using binary search
   	public static int findRotationCount(int[] a, int n) {
   		int low = 0;
   		int high = n-1;
   		while(low<=high) {
   			if(a[low]<=a[high]) return low;
   			int mid = (low+high)/2;
   			int next = (mid+1) % n;
   			int prev = (mid+n-1) % n;
   			if(a[mid]<=a[prev] && a[mid]<=a[next]) {
   				return mid;
   			}
   			else if(a[mid]<=a[high]) {
   				high = mid-1;
   			}
   			else if(a[mid]>=a[low]) {
   				low = mid+1;
   			}
   		}
   		return -1;
   	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {6,5,4,3,1,2};
        int n = a.length;
        System.out.println(noOfRotation(a,n));

	}

}
