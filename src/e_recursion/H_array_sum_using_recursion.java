package e_recursion;

public class H_array_sum_using_recursion {

	public static int arraySum(int[] a,int n) {
		int sum = 0;
		
			if(n<=0) return 0;
			sum = a[n-1]+arraySum(a,n-1);
			
		
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		int n = a.length;
		System.out.println(arraySum(a,n));
	}

}
