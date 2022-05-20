package l_hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//problem link
//https://leetcode.com/problems/intersection-of-two-arrays/submissions/

public class D_intersection_of_two_arrays {

	public static int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> ans = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		// we want unique elements in the result so we are using set
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		// put unique elements of arr1
		for (int i : nums1) {
			set1.add(i);
		}
		// put unique elements of arr2
		for (int i : nums2) {
			set2.add(i);
		}

		// iterate through the set1 and put all the elements in the map
		for (int i : set1) {
			map.put(i, 1);
		}

		// iterate through the set2 and check if the elements of set2 already exist in
		// map, if it exist it means it also present in the set1 that is our common
		// element(intersected element) put that element in the arraylist 

		for (int i : set2) {
			if (map.containsKey(i)) {
				ans.add(i);
			}
		}
		
		//we have to return the array so convert arraylist to array
		int[] ans1 = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			ans1[i] = ans.get(i);
		}
		return ans1;
	}

	public static void main(String[] args) {
		int[] arr2 = { 2, 6, 8, 2, 2, 5, 4, 3 };
		int[] arr1 = { 2, 3, 4, 7 };
		int[] a = intersection(arr2, arr1);

		for (int i : a) {
			System.out.print(i + " ");
		}
//		System.out.println(intersection(arr1,arr2));

	}

}



//public static int[] intersection(int[] nums1, int[] nums2) {
//    HashSet<Integer> set1 = new HashSet<>();
//    HashSet<Integer> set2 = new HashSet<>();
//    for(int i : nums1){
//        set1.add(i);
//    }
//     for(int i : nums2){
//        set2.add(i);
//    }
//   
//    set1.retainAll(set2);
//    
//    int[] ans1 = new int[set1.size()];
//    int i = 0;
//    for (int x : set1)
//        ans1[i++] = x;
//   
//     return ans1;
//}
