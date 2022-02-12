package e_recursion;

//first index of the number in array

public class I_find_number_using_recursion {

	public static int  findNumber(int[] a,int x,int startIndex) {
		if(a[startIndex] == a.length) {
			return -1;
		}
		if(a[startIndex]==x) return startIndex;
		return findNumber(a,x,startIndex+1);
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,2,3,3,2,3,4,5,6};
		int x = 3;
		System.out.println(findNumber(a,x,0));
	}

}
