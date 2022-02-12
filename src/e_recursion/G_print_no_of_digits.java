package e_recursion;

public class G_print_no_of_digits {

	public static int countDigits(int n) {
		if(n==0) return 0;
		int ans = countDigits(n/10);
		return ans+1;
	}
	
	public static void main(String[] args) {
		
		int n = 1564;
		System.out.println(countDigits(n));

	}

}
