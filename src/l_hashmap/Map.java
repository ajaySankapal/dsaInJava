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
	public int getBucketIndex(k key) {
		int hc = key.hashCode();
		int index = hc%numBuckets;
		return index;
	}
	
	//insert element into the hashmap
	public void insert(k key,v value) {
		int bucketIndex = getBucketIndex(key);
		MapNode<k,v> head = buckets.get(bucketIndex);
		
		//if element is already there? iterate to that element and update its value
		while(head != null) {
			//iterate through the linked list and check if its key is equal to the key we are providing,
			//if it is equal to we update its value to the value we are providing in the insert function
			if(head.key.equals(key)) {
				head.value = value;	
			}
			head = head.next;
		}
		
		//if element is not there, create new element and put it at the head of the linked list
		
		//making head to the bucketIndex, because it might have become null if the above loop conditions is satisfied
		head = buckets.get(bucketIndex);
		//creating new node because the node/element is not present
		MapNode<k,v> newNode = new MapNode<>(key,value);
		//point new node head to the prev head of the linked list
		newNode.next = head;
		//storing the reference of the head of the newly created linked list in the bucketIndex
		buckets.set(bucketIndex, newNode);
		count++;
		
	}
	
}
