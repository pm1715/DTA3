package com.deloitte.collection;

import java.util.*;

//class Test <P>{
//	P obj;
//	public void setvalue(P obj) {
//		this.obj=obj;
//	}
//	
//}
class Animal{
	
}
class Cat extends Animal{
	
}
class BlackCat extends Cat{
	
}
public class gener {
      public void add(ArrayList<? extends Cat> test) {
    	  
      }

	public static void main(String[] args) {
		gener o= new gener();
		ArrayList<Animal> a = new ArrayList<Animal>();
		ArrayList<Cat> c = new ArrayList<Cat>();
		ArrayList<BlackCat> b = new ArrayList<BlackCat>();
//		o.add(a);
		o.add(b);
		o.add(c);
		// TODO Auto-generated method stub
//		Test<String> o1 =new Test<String>();
//		o1.setvalue("hello");
//		Test<Integer> o2 =new Test<Integer>();
//		o2.setvalue(123);
		
		

	}

}
