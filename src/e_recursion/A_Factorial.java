package e_recursion;
//recursion is a method in which solution to a problem depends upon the solution of smaller instance of the same problem
public class A_Factorial {

	public static int Factorial(int n) {
		if (n == 0)
			return 1; // base case //if n = 0 then time is 1 T(0) = 1;
		return n * Factorial(n - 1); // recursive call //for n>0 T(n-1) and constant work 3
	}

	public static void main(String[] args) {
		int n = 6;
		int fact = Factorial(n);
		System.out.println(fact);
	}

}

//time complexity of recursive methods
//T(n) = T(n-1)+3
//T(n) = T(n-2)+6;
//T(n) = T(n-3)+9
//T(n) = T(n-k)+3k
//if n-k = 0
//k = n
//T(n) = T(0)+3n
//T(n) = 3n+1   bcz T(0) = 1;
//time complexity : O(n)

//space complexity analysis
// f(5) goes on to call f(4) recursively and then f(4) calls f(3) , f(3) calls (f2) , f(2) calls f(1), f(1) calls f(0) . f(0) is our base case. f(5) and all the other function remains on pause state until the next call returns something.
// space complexity is O(n)
