package l_hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class B_remove_duplicates {
	
	public static ArrayList<Integer> removeDuplicates(int[] arr){
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer,Boolean> map = new HashMap<>();
		
		for(int i = 0; i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}else {
				output.add(arr[i]);
				map.put(arr[i], true);
			}
		}
		
		return output;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,2,2,4,5,6,8,1,5,4};
		ArrayList<Integer> output = removeDuplicates(arr);
		System.out.println(output);

	}

}
