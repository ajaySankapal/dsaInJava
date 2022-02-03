package c_numbers;

public class A_isPrime_number {
	
	public static boolean isPrime(int n) {
		int i ;
		for(i=2;i<n;i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 19;
		System.out.println(isPrime(n));

	}

}
