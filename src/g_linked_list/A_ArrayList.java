package g_linked_list;

import java.util.List;
import java.util.ArrayList;
public class A_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrlist = new ArrayList<>();
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(0, 2);
		arrlist.remove(3);
		arrlist.set(0, 5);
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		//print
		System.out.println(arrlist);
		
		//iterate:for loop
		for(int i = 0; i<arrlist.size();i++) {
			System.out.print(arrlist.get(i)+" ");
		}
		System.out.println("");
		//iterate : for-each loop
		for(int i:arrlist) {
			System.out.print(i+" ");
		}

	}

}
