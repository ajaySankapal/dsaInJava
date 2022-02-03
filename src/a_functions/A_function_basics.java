package a_functions;

import java.util.Scanner;

//functions are very important in programming 1.it avoid repetition in code remember DRY principle 2. if there is some mistakes in your code you have to check it at only one place

public class A_function_basics {
    
	public static int factorial(int num) {
		int fact = 1;
		for(int i = 1; i<=num ; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		//NcR
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	    int r = s.nextInt();
	    
//	    int factN = 1;
//	    for(int i = 1; i<=n; i++) {
//	    	factN = factN*i;
//	    }
//	    
//	    int factR = 1;
//	    for(int i = 1; i<=r; i++) {
//	    	factR = factR*i;
//	    }
//	    int factNR = 1;
//	    for(int i = 1; i<= (n-r);i++) {
//	    	factNR = factNR*i;
//	    }
	    int factN = factorial(n);
	    int factR = factorial(r);
	    int factNR = factorial(n-r);
	    int result = factN /(factR*factNR);
	    System.out.println(result);
	}

}
