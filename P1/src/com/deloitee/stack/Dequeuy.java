package com.deloitee.stack;
import java.util.*;
public class Dequeuy {

	public static void main(String[] args) {
		ArrayDeque<Integer> deq= new ArrayDeque<Integer>();
		deq.add(10);
		deq.add(20);
		System.out.println(deq);
		deq.addLast(30);
		deq.addFirst(40);
		System.out.println(deq);
		deq.remove();
		System.out.println(deq);
		deq.removeLast();
		System.out.println(deq);
		deq.poll();
		System.out.println(deq);
	}

}
