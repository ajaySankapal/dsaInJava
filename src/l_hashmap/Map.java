package l_hashmap;

import java.util.ArrayList;

public class Map<k,v> {
   
	ArrayList<MapNode<k,v>> buckets;
	int count;
	int numBuckets;
	
	public Map() {
		buckets = new ArrayList<>();
		numBuckets = 20;
		for(int i = 0; i<numBuckets;i++) {
			buckets.add(null);
		}
	}
	
}
