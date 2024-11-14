package com.deloitte.basics;

public class static1 {

	public static  String stat="Static Varible";
	public String stat2="Non Static Variable";
	
	public static void static_method() {
		System.out.println("I am a static method");
	}
	
	public void non_static_method() {
		System.out.println("i am a non static method");
	}
	public static void main(String[] args) {
		System.out.println(stat);
//		System.out.println(stat2);
		static1 s=new static1();
		System.out.println(s.stat2);
		
		static_method();
//		non_static_method();
		s.non_static_method();
		
		

	}

}
