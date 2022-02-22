package b1_2D_arrays;

import java.util.ArrayList;
import java.util.List;

public class E_maximum_row_column_sum {

	//max sum row or column
	public static List<Integer> maxSumRowOrColumn(int[][] arr) {
		List<Integer> ans = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		int rowL = arr.length;
		int colL = arr[0].length;
		int index = -1;
		boolean isRow = true;
		//calculate rows sum
		for(int i = 0; i<rowL;i++) {
			int rowSum = 0;
			for(int j = 0; j<colL;j++) {
				 rowSum +=arr[i][j];
			}
			if(max<rowSum) {
				max = rowSum;
				index = i;
			}
		}
		
		for(int j = 0; j<colL;j++) {
			int colSum = 0;
			for(int i = 0; i<rowL;i++) {
				colSum+=arr[i][j];
			}
			if(max<colSum) {
				isRow = false;
				max = colSum;
				index = j;
			}
		}
		ans.add(max);
		ans.add(index);
		
		if(isRow) {
			System.out.println("row");
		}else {
			System.out.println("col");
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[][] = {{3,6,9},{1,4,7},{2,8,9}};
		System.out.println(maxSumRowOrColumn(arr));

	}

}
