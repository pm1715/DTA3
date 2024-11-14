package com.deloitte.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class c1 {
public static void main(String[] args) {
	List l = new ArrayList();
	l.add(1);
	l.add("f");
	l.add(4.5);
	System.out.println(l);
	
	
	ArrayList<String> al = new ArrayList<String>();
	al.add("l");
	System.out.println(al);
	Queue q = new PriorityQueue();
	q.add(1);
	q.add(2);
	System.out.println(q);
	
	Stack s = new Stack();
	s.add(1);
	s.add(2);
	System.out.println(s);
	
	
} 
}
