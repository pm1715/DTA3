package com.deloitte.java8;
@FunctionalInterface
interface methodrefe {
	void getMessage();
}
class methodreferdemo {
	public void message() {
		System.out.println("hello how are yout today");
	}
	public static void display() {
		System.out.println("inside static emthos");
	}
	methodreferdemo(){
		System.out.println("Inside constructor ");
	}
}
public class Methodref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodreferdemo demo = new methodreferdemo();
		methodrefe ref = demo::message;
		ref.getMessage();
		
		methodrefe ref1=methodreferdemo::display;
		ref1.getMessage();
		
		methodrefe ref2=methodreferdemo ::new;
		ref2.getMessage();
		
	}

}
