package com.deloitee.classy;

import com.deloitee.classy.outer1.memberclass;

class outer1{
	class memberclass{
		void print() {
			System.out.println(" i sm s member inner class");
		}
	}
}
public class Nonstatic_member {

	public static void main(String[] args) {
		outer1 o = new  outer1();
		memberclass m = o.new memberclass();
		m.print();
	}

}
