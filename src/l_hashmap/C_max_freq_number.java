package l_hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class C_max_freq_number {

	public static int maxFreq(int[] a) {
		int freq = 1;
		HashMap<Integer,Integer> map = new HashMap<>();
		//iterate through the array and put them in hashmap
		for(int i = 0; i<a.length;i++) {
			//if the hashmap already has that key increment its value by 1
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		
		//to find max
		int max = 0,ans = Integer.MIN_VALUE; 
		for(int i: a) {
			//iterate through the array and get the max frequent element
			//initialize max with 0, if the element's value is greater than max reinitialize max with that element
			if(map.get(i)>max) {
				max = map.get(i);
				ans = i;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int[] a = {1,5,7,6,1,4,8,6,2,4,5,2,2,4,2};
		int[] b = a;
		Arrays.sort(b);
		for(int i:b) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println(maxFreq(a));

	}

}
