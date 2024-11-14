package com.deloitte.poly;
import java.util.*;
public class Mainone {

	public static void main(String[] args) {
		
		//simple adddtion -1+3 =2
		parent p1= new parent();
		System.out.println(p1.addition(-1,3));
		
		//absolute addition |-1|+|3| = 4
		child c1= new child();
		System.out.println(c1.addition(-1,3));
	
	}

}
