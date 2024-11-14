package com.deloitte.java8;
@FunctionalInterface
interface interface1{
	void interface_method();
}
class class1{
	public void class_method() {
		System.out.println("Inside class method");
	}
	public static void static_method() {
		System.out.println("inside static method");
	}
	class1(){
		System.out.println("inside the constructor ");
	}

}

public class NewMethodRef {

	public static void main(String[] args) {

		interface1 ref3=class1::new;
		ref3.interface_method();
		
		class1 c1= new class1();
		
		

		interface1 ref1= c1::class_method;
		ref1.interface_method();

		interface1 ref2=class1::static_method;
		ref2.interface_method();
		


	}

}
