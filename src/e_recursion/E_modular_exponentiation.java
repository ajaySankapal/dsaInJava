package e_recursion;

public class E_modular_exponentiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}










//x^n % M
//(x * n) % M = { (x%M) * (n%M) } % M
// x^n-1 % M = (x * x^n-1) % M
//			 = { (x % M) * (x^n-1 % M) } % M when n is odd
//            = { (x^n/2 % M)*(x^n/2 % M)} % M when n is even
//           = 1 when n is 0