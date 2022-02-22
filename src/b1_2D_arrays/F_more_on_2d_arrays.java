package b1_2D_arrays;

public class F_more_on_2d_arrays {

	public static void main(String[] args) {
//		int[][] arr = new int[3][4];
//		System.out.println(arr[1][2]);  //by default values assigned are 0
		int arr2[][] = new int[3][];  // no errors are showing it means it is an valid syntax
		System.out.println(arr2);  //[[I@76ed5528 it is a 2d array for sure
		for(int i = 0; i<arr2.length;i++) {
			System.out.println(arr2[i]); //null  there is 3 rows but no column so it stored null
			// in case of non primitive data type like references if we dont initialize any value then by default "null" is assigned to them
			// here we have not initialized reference of columns so null is assigned to them
		}
//		int arr3[][] = new int[][5]; // if we provide only column and not rows then it is not allowed "Cannot specify an array dimension after an empty dimension"
		                             //because no of columns are in rows only. if we are providing column only that mean we are making the reference of row to null by default and then on top of that we are assigning values of column which can be possible by the refernce of rows only. nullllll
//		System.out.println(arr2[1][0]);  //NullPointerException

	}

}
