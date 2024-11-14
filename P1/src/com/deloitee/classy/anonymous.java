package com.deloitee.classy;
class outer2{
	void show() {
		System.out.println("i not anyomous");
	}
}
public class anonymous {

	public static void main(String[] args) {
		outer2 o = new outer2() {
			void show() {
				System.out.println("i am anoynous");
			}
		};
		o.show();
		
	}

}
