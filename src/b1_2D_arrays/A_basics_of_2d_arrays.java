package b1_2D_arrays;

public class A_basics_of_2d_arrays {

	public static void main(String[] args) {
//		int[][] arr2D = new int[3][4];
//		//3 rows and 4 columns array
//		System.out.println(arr2D[1][1]);
//		arr2D[1][1] = 4;
//		System.out.println(arr2D[1][1]);
		int[][] arr = {{1,2,3},{3,4,5},{5,6,7}};
		//arr is a reference of arrays. each reference is of one dimensional array
		System.out.println(arr); // "[[I@76ed5528" "[[" two square bracket means it is reference of two dimensional array
		System.out.println(arr[0]); //first row as one dimensional array
		System.out.println(arr[1]); //second row as one dimensional array
		System.out.println(arr[2]); //third row as one dimensional array
//		System.out.println(arr[3]); 
		System.out.println(arr.length);//no. of rows  //the output is 3 because it is containing three references.. arr is the arr of references
		System.out.println(arr[0].length); //no of columns
	}

}
