package com.deloitte.opps;

public class MethodOverloadding {
	
	MethodOverloadding(int i){
	      
	}

	public MethodOverloadding() {
		// TODO Auto-generated constructor stub 
	}

	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	static double add(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		MethodOverloadding m= new MethodOverloadding();
		MethodOverloadding m1= new MethodOverloadding(3);
		System.out.println(add(a,b));
		System.out.println(add(a,b,c));
		System.out.println(add(1.5,7));

	}

}
