package com.deloitee.stack;
import java.util.*;
//import java.util.concurrent.PriorityBlockingQueue;
public class queuey {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue= new PriorityQueue<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println(queue);
		queue.poll();
		queue.remove();
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		
	}

}
