package d_strings;

public class A_print_all_char_in_nextline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ajay Sankapal is cool af";
		int count = 0;
		int n = name.length();
		for(int i = 0; i<n ; i++) {
//			System.out.println(name.charAt(i));
			if(name.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count+1);

	}

}
