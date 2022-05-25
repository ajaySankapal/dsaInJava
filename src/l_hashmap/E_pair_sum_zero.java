package l_hashmap;

import java.util.HashMap;

public class E_pair_sum_zero {

	public static HashMap<Integer,Integer> pairSumZero(int[] arr){
		HashMap<Integer,Integer> map = new HashMap<>();
		int count = 0;
		for(int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		for(int key:map.values()) {
			
		}
		
		return map;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,-1,2,3,-2,4,-3,-2,5};
		System.out.println(pairSumZero(arr));

	}

}
