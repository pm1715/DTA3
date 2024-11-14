package com.deloitte.this1;
class A1{
	A1(){
		System.out.println("i am the default constrctutor of Class A");
	}
	A1(int num){
		System.out.println(" i am parametirzed cons of Classs A : "+num);
	}
}

class B extends A1{
	B(){
		super(3);
		System.out.println("i am the default constructor of Class B");		
	}
}
class C extends B{
	C(){
		
	}

	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Suppper {

	public static void main(String[] args) {
		C c = new C() {
		   public void show() {
			   System.out.println("anoymous class");
		   }
		};
		c.show();

	}

}
