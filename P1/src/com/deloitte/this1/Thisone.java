package com.deloitte.this1;
class A{
	public int rollno;
	A(){
     this(3);
	}
	A(int rollno){
		this.rollno=rollno;
	}
	
}
public class Thisone {
	Thisone(int a){
		
	}
	Thisone(){
		
	}
	
	public static void main(String[] args) {
		
		A j=new A(2);
		System.out.println(j.rollno);
		A t=new A();
		System.out.println(t.rollno);
	}

}
