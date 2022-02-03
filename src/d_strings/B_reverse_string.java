package d_strings;

public class B_reverse_string {
	
	public static String reverse(String str) {
		String reversedStr = "";
//		for(int i = str.length()-1; i>=0;i--) {
//			reversedStr = reversedStr+str.charAt(i);
//		}
		
		for(int i = 0; i<str.length();i++) {
			reversedStr = str.charAt(i)+reversedStr;
		}
		return reversedStr;
	}
	public static void main(String[]  args) {
		String name = "Sankapal";
		System.out.println(reverse(name));
	}

}
