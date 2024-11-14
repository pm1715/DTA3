package com.deloitte.map;
import java.util.*;
public class hashmap1 {

	public static void main(String[] args) {
	HashMap<Integer, String> map1=new HashMap<Integer, String>();
	map1.put(1, "prayansh");
	
	HashSet<Integer> set1=new HashSet<>(map1.keySet());
	System.out.println(set1);
	
	System.out.println(map1);
	map1.put(3, "prayansh");
	System.out.println(map1);
	map1.put(2, "abcd");
	System.out.println(map1);
	map1.remove(3);
	System.out.println(map1);
	System.out.println(map1.get(1));
	
	System.out.println(map1.size());
	map1.replace(2, "john");
	System.out.println(map1);
	
	System.out.println(map1.keySet());
	System.out.println(map1.values());
	
	}

}
