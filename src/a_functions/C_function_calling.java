package a_functions;

public class C_function_calling {
	
	//callee gives back the control to it's caller when it done executing
	//every function has it's own set of local variables
	//pass by value: only the value is passed not the reference in this case the increment function increment the n but don't change value in the n of main method. because it has only the value of n not the reference 
	public static void increment(int n) {
		n++;  // this is referring to the n which is created in this increment funcion	
		System.out.println("value of n in increment:"+n);
	}
	
	public static void b() {
		System.out.println("inside b");
	}
	
	public static void a() {
		b();
		System.out.println("inside a ");
	}

	public static void main(String[] args) {
//		a();
//		System.out.println("inside main");
		
		int n = 10;
		increment(n);
		System.out.println("value of n"+n);
		

	}

}
