package com.deloitte.uitl;
import java.util.*;
public class collectionsclass {

	public static void main(String[] args) {
	ArrayList<Integer> num=new ArrayList<>();
	num.add(28);
	num.add(38);
	num.add(12);
	num.add(45);
	num.add(28);
	num.add(87);
	System.out.println(num);
	Collections.sort(num);
	System.out.println(num);

	System.out.println(Collections.binarySearch(num,12));
	
	System.out.println(Collections.max(num));
	System.out.println(Collections.min(num));
	Collections.reverse(num);
	System.out.println(num);
	
	Collections.shuffle(num);
	System.out.println(num);
	
	Collections.fill(num, 1);
	System.out.println(num);
	}

}
