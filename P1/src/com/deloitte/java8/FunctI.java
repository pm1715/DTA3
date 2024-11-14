package com.deloitte.java8;
//@FunctionalInterface
interface A{
	public static int factorial(int n) {
		if(n==0) return 1;
		return n*factorial(n-1);
	}
}
class B implements A{

	


	
	
}
public class FunctI {

	public static void main(String[] args) {
		
		System.out.println(A.factorial(4));
		

	}

	
}
