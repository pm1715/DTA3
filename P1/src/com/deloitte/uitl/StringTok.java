package com.deloitte.uitl;
import java.util.*;
public class StringTok {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st1= new StringTokenizer("this is a cat");
		System.out.println(st1.countTokens());
		System.out.println("This is the st1");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		System.out.println();
		
		StringTokenizer st2= new StringTokenizer("this is, a cat", ",");
		System.out.println("This is the st2"+st2.countTokens());
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		System.out.println();
		
		StringTokenizer st3= new StringTokenizer("this is ,a cat",",", true);
		System.out.println("This is the st3 "+st3.countTokens());
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		System.out.println();
//		System.out.println(st2);
	}

}
