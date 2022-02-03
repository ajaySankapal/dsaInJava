package b_arrays;

import java.util.Arrays;

public class F_frequency_of_element {

	public static void frequencyOfElement(int[] arr) {
		int n = arr.length;
		
		boolean visited[] = new boolean[n];
		Arrays.fill(visited,false);
		for(int i = 0;i<n;i++) {
			int count = 1;
			if(visited[i] == true)
				continue;
			
			for(int j = i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					
					visited[j] = true;
					count++;
					
				}
				
				
			}
			System.out.println(arr[i]+" "+count);
		}
		
			
			
		
		
	}
	
	public static void main(String[] args) {


		int arr[] = {10,20,10,30,25,20,30,10};
		frequencyOfElement(arr);

	}

}
