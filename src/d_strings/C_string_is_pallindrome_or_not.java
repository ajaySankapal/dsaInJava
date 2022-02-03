package d_strings;

public class C_string_is_pallindrome_or_not {

//	public static void isPallindrome(String str) {
//		String reversedStr = "";
//		boolean ans = false;
//		for(int i = 0; i<str.length();i++) {
//			reversedStr = str.charAt(i)+reversedStr;
//		}
//		if(str.equals(reversedStr)) {
//			ans = true;
//		}
//		else {
//			ans = false;
//		}
//		System.out.println(ans);
//			
//	}
	
	public static boolean isPallindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		while(start <= end) {
			
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			else if(str.charAt(start) == str.charAt(end)) {
				start++;
				end --;
				
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "ajay";
	System.out.println(isPallindrome(name));

	}

}
