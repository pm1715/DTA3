package com.deloitte.this1;
class outer{
	void methode() {
		class local{
			void innermethod() {
				System.out.println("i am local inner class");
			}
		}
		local l = new local();
		l.innermethod();
	}
}
public class innnerclass {

	public static void main(String[] args) {
		//StrtingBuffer str = new String("hello");

//		System.out.println(str);
		outer o = new outer();
		o.methode();
		outer o1 = new outer() {
			void methode() { 
				System.out.println("i am the anoynous");
			}
		};
		o1.methode();
	}

}
