package com.deloitee.objclass;
import java.util.*;
public class ObjectClass {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s= new StringBuffer("hello");
		s.append("world");
		System.out.println(s);
		String name ="prayansh";
	
		
		
		ObjectClass o = new ObjectClass();
		System.out.println(o instanceof ObjectClass);
		ObjectClass o1= new ObjectClass();
		o1=o;
		System.out.println(o.equals(o1));
		System.out.println(o.toString());
		
		System.out.println(o.getClass());
		String a="java";
		String b="c";
		int num=100;
		System.out.println(a.hashCode()+" "+b.hashCode());

	}

}
