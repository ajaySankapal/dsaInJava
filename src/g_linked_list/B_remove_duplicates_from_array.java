package g_linked_list;

import java.util.ArrayList;
//remove consecutive duplicates
public class B_remove_duplicates_from_array {

	public static void removeDuplicates(int[] a) {
	int n = a.length;

	ArrayList<Integer> newArr = new ArrayList<>();
	newArr.add(a[0]);
	for(int i = 1;i<n;i++) {
		if(a[i] != a[i-1]) {
			newArr.add(a[i]);
			
		}
	}
	System.out.println(newArr);
}   
	
	
	public static void main(String[] args) {
		
	int[] a = {1,2,2,2,3,3};
	
	removeDuplicates(a);

	}

}
