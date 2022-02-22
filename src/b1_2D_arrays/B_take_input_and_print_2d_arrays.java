package b1_2D_arrays;

import java.util.Scanner;

public class B_take_input_and_print_2d_arrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.println("enter no. of rows");
//		int rows= s.nextInt();
//		System.out.println("enter no. of columns");
//		int columns = s.nextInt(); 
//		int[][] arr2d = new int[rows][columns];
//		for(int i = 0; i<rows;i++) {
//			System.out.println("enter elements of "+i+" th row");
//			for(int j = 0; j<columns;j++) {
//				arr2d[i][j] = s.nextInt();
//			}
//			System.out.println("");
//		}
//		
//		//print
//		for(int i = 0; i<rows;i++) {
//			for(int j = 0; j<columns;j++) {
//				System.out.print(arr2d[i][j]+" ");
//			}
//			System.out.println("");
//		}
//		System.out.println("");

		
		//take input column wise and print it
		System.out.println("enter no. of columns ");
		int cols = s.nextInt();
		System.out.println("enter no. of rows");
		int rowss = s.nextInt();
		int[][] arr2dC = new int[rowss][cols];
		for(int j = 0;j<cols;j++) {
			
			for(int i = 0; i<rowss;i++) {
				System.out.println("enter elements of "+j+" th column "+i+" th row");
				arr2dC[j][i] = s.nextInt();
				
			}
		}
		//print
				for(int i = 0; i<rowss;i++) {
					for(int j = 0; j<cols;j++) {
						System.out.print(arr2dC[j][i]+" ");
					}
					System.out.println("");
				}
				System.out.println("");
		
	}

}
