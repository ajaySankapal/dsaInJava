package b1_2D_arrays;

import java.util.ArrayList;
import java.util.List;

public class D_row_wise_sum {

	//row wise sum
	public static List<Integer> rowWiseSum(int[][] arr){
		List<Integer> sum = new ArrayList<>();
		for(int i = 0;i<arr.length;i++) {
			int sumAns = 0;
			for(int j = 0; j<arr[0].length;j++) {
				sumAns = sumAns+arr[i][j];
				
			}
			sum.add(sumAns);
		}
		
		
		return sum;
	}
	
	public static void main(String[] args) {
		int arr[][] ={ {1, 1, 1, 1}, 
                {2, 2, 2, 2}, 
                {3, 3, 3, 3}, 
                {4, 4, 4, 4}};
		List<Integer> output = rowWiseSum(arr);
System.out.println(output);
	}

}
