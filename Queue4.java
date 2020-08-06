// Program Of Implementing Least Recently Used(LRU) Cache Implementation Using LinkedList

import java.util.*;

class Queue4 {
	Set<Integer> cache;
	int capacity;

	public Queue4(int capacity) {
		this.cache = new LinkedHashSet<Integer>(capacity);
		this.capacity = capacity;
	}

	public boolean get(int key) {
		if(!cache.contains(key)) 
			return false;
		cache.remove(key);
		cache.add(key);
		return true;	
	}

	public void refer(int key) {
		if(get(key) == false)
			put(key);
	}

	public void display() {
		Iterator<Integer> itr = cache.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}

	public void put(int key) {
		if(cache.contains(key))
			cache.remove(key);

		else if(cache.size() == capacity) {
			int firstKey = cache.iterator().next();
			cache.remove(firstKey);
		}
		cache.add(key);
	}

	public static void main(String args[]) {
		Queue4 ca = new Queue4(4);
		ca.refer(1);
		ca.refer(2);
		ca.refer(3);
		ca.refer(1);
		ca.refer(4);
		ca.refer(5);
		ca.display();
	}
}
