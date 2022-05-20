package l_hashmap;

import java.util.HashMap;
import java.util.Set;

public class A_basics {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		
		//insert
		map.put("ab", 10);
		
		//check presence of any key
		
		if(map.containsKey("ab")){
			System.out.println("map contains ab");
		}
        if(map.containsKey("def")) {
        	System.out.println("map contains def");
        }else {
        	System.out.println("does not contains def");
        }
        
        //get values
        System.out.println(map.get("ab"));
        
        //remove
        map.remove("ab");
        if(map.containsKey("ab")){
			System.out.println("map contains ab");
		}else {
			System.out.println("map does not contain ab");
		}
        
        //size of the map
        System.out.println("size of the map is: "+map.size());
        
        map.put("abc", 2);
        map.put("xyz", 4);
        
        //iterate
//        Set<String> keys = map.keySet();
//        for(String s:keys) {
//        	System.out.print(s);
//        }
        for(int key:map.values()) {
        	System.out.println(key);
        }
        
        
	}

}
