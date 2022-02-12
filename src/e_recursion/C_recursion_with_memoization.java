package e_recursion;


//for f(5) we are calcularing f(2) thrice, f(3) twice it simply increases the time and space complexity of the program
//recursion with memoization : when done calculating the result store it somewhere 


public class C_recursion_with_memoization {
	
	static int F[] = new int[70];

	public static int Fib(int n) {
		if(n<=1) return n;
		
		if(F[n] != -1) {
			return F[n];
		}
		F[n] = Fib(n-1)+Fib(n-2);
		return F[n];
	}
	
	public static void main(String[] args) {
		
		for(int i = 0; i<70;i++) {
			F[i] = -1;
		}
		int fib = Fib(50);
		  System.out.println(fib);

	}

}
