package com.deloitte.basics;
import java.util.*;
public class two {

	public static int Convert(int kilometre) {
		return kilometre*1000;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value in(km) to Convert to Meters");
		int km =sc.nextInt();
		System.out.println(km+" km is "+Convert(km)+" m");
		

	}

}
