package com.deloitee.classy;

class outer{
 static class staticclass{	
	 void print() {
		 System.out.println("i am a static inner class");
	 }
 }
}
public class Staticclass {

	public static void main(String[] args) {
		outer o = new outer();
		outer.staticclass s= new outer.staticclass();
		s.print();
		
	}

}
