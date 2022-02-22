package b1_2D_arrays;

import java.util.Scanner;

public class C_functions_with_2d_arrays {

   static Scanner s = new Scanner(System.in);
	
   //take input of 2d arrays
	public static int[][] takeInput(){
		System.out.println("enter no of rows ");
		int rows = s.nextInt();
		System.out.println("enter no of cols ");
		int cols = s.nextInt();
		int[][] arrF = new int[rows][cols];
		for(int i= 0; i<rows;i++) {
			for(int j =0 ;j<cols;j++) {
				System.out.println("enter element at "+i+" th row "+j+" th col");
				arrF[i][j] = s.nextInt();
			}
		}
		
		return arrF;
	}
	
	//print 2d array
	public static void print2DArr(int[][] arrP) {
		for(int i = 0; i<arrP.length;i++) {
			for(int j = 0; j<arrP[0].length;j++) {
				System.out.print(arrP[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
		int arr[][] = takeInput();
		print2DArr(arr);

	}

}
