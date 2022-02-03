package a_functions;

// due to pass by value we are not getting updated value. to get the updated value we have to declare the function with return type because now it returns the number and that number we have to store and display that updated number

public class D_function_calling_pass_by_value {

	public static void c(int n) {
		System.out.println("value of n in c: "+n);
		n++;
	}
	public static void b(int n) {
		c(n);
		System.out.println("value of n in c: "+n);
		n++;
	}
	public static void a(int n) {
		b(n);
		System.out.println("value of n in c: "+n);
		n++;
	}
	
	
	public static void main(String[] args) {
		int n = 10;
		a(n);
		System.out.println("value of n in main :"+n);

	}

}
