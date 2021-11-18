package designs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {
	
	/** Initialize your data structure here. */
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        
    }
    
    public void remove(int key) {
        
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        
    }
    
	public static void main(String[] args) {
		MyHashSet hashSet = new MyHashSet();
		hashSet.add(1);         
		hashSet.add(2);         
		hashSet.contains(1);    // returns true
		hashSet.contains(3);    // returns false (not found)
		hashSet.add(2);          
		hashSet.contains(2);    // returns true
		hashSet.remove(2);          
		hashSet.contains(2);    // returns false (already removed)
	}

}
