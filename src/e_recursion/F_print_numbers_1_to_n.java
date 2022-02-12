package e_recursion;

public class F_print_numbers_1_to_n {

	public static void printn(int n) {
	   
	   if(n==0) return;
	   printn(n-1);
	   System.out.print(n+" ");
	   
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printn(n);

	}

}
