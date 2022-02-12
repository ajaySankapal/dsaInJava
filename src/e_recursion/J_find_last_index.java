package e_recursion;

public class J_find_last_index {

	public static int lastIndex(int[] a,int x,int startIndex) {
	
		if(startIndex == a.length) return -1;
		int smallAns = lastIndex(a,x,startIndex+1);
		if(smallAns != -1) {
			return smallAns;
		}
		if(a[startIndex]==x) {
			return startIndex;
		}else {
			return -1;
		}
		
		 
	}
	
	public static void main(String[] args) {

		int[] a = {1,2,2,2,2,3};
		int x = 2;
	System.out.println(lastIndex(a,x,0));	
	}

}
