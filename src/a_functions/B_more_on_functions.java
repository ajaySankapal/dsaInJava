package a_functions;

import java.util.Scanner;

//return means exit the function. it will not execute any code
// if you want to store the result somewhere and want to do some task on that result you have to use return and store it ;
public class B_more_on_functions {
	
	//task1
	public static int add(int a,int b) {
		
		return a+b;
	}
	
	//task2
	//what if we have given task to print even number starting from a to b then we have to pass input parameters in the function for starting and ending point and also have to check if the starting point is not odd number
	public static void printEvenNumbers(int start,int end) {
		if(start%2!=0) {
			start++;
			for(int i = start;i<=end;i+=2) {
				System.out.println(i);
			}
		}
		
	}
	
	//task3
	public static void divide(int a , int b) {
		if(b == 0) {
			return;
		}
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		
		//task1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a:");
//		int a = sc.nextInt();
//		System.out.println("enter b:");
//		int b = sc.nextInt();
//		int result = add(a,b);
//		System.out.println("the sum of the number is: "+result);
//        int a = printEvenNumbers();  // can not store value of the function which is returning void
		
		//task2
//		 printEvenNumbers(3,17);
		 
		 //task3
		 divide(16,5);
	}

}
