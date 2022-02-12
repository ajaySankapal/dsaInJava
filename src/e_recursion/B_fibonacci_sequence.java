package e_recursion;
//why recursion some time is not a good case?
//it can be expensice wrt to time and space
public class B_fibonacci_sequence {

//	public static int Fib(int n) {
//		if(n<=1) return n;
//		int f = 0;
//		int f1 = 0;
//		int f2 = 1;
//		for(int i = 2; i<=n;i++) {
//			f=f1+f2;
//			f1=f2;
//			f2=f;
//		}
//		return f;
//		
//	}
	
	//recursive method 
	public static int Fib(int n) {
		if(n<=1) return n;
		return Fib(n-1)+Fib(n-2);
	}
	
	public static void main(String[] args) {
  int fib = Fib(40);
  System.out.println(fib);

	}

}



//time complexity analysis
//T(0) = T(1) = 1 when n<=1;
//t(n) = t(n-1)+t(n-2)+4
//t(n-1) = t(n-2)
//t(n) = 2t(n-2)+c
//t(n) = 2(2(t(n-4)+c)+c
//t(n) = 4t(n-4)+3c **
//t(n) = 4(2t(n-6)+c)+3c
//t(n) = 8t(n-6)+7c **
//t(n) = 16t(n-8)+15c **
//t(n) = 2^kt(n-2k)+(2^k-1)c
//n-2k = 0
//k = n/2
//t(n) = 2^n/2t(0)+(2^n/2-1)c
//t(n) = (1+c)*2^n/2 - c

//t(n) = 2^n/2 (lower bound)

//if t(n-2) = t(n-1)
//t(n) = 2^n (upper bound) big-O notation O(2^n) //exponential time algorithm (worst)
