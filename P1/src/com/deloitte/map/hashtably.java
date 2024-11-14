package com.deloitte.map;
import java.util.*;
public class hashtably {

	public static void main(String[] args) {
		Hashtable<Integer,String> emp= new Hashtable<>();
		emp.put(1001,"john");
//		emp.put(null, "abcd");
//		emp.put(null, null);
		emp.put(1002, "abcd");
		System.out.println(emp);
	}

}
