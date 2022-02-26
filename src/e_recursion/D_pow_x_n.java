package e_recursion;

public class D_pow_x_n {

//	public static int pow(int x,int n) {
//		int res = 1;
//		for(int i = 1; i<=n;i++) {
//			res = res*x;
//		}
//		return res;
//	}
	
	public static int pow(int x, int n) {
	  if(n==0) return 1;
	  return x*pow(x,n-1);
	}

//	public static int pow(int x, int n) {
//		if(n==0) return 1;
//		int ans = 0;
//		if(n%2==0) {
//			ans = pow(x,n/2);
//			return ans*ans;
//		}
//		return x*pow(x,n-1);
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int n = 2;
        System.out.println(pow(x,n));
	}

}
