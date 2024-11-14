package com.deloitte.collection;
import java.util.*;
public class linkedylist {

	public static void main(String[] args) {
		LinkedList<Integer> l1= new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(67);
		System.out.println(l1);
		ListIterator<Integer> I= l1.listIterator();
		
	}

}
