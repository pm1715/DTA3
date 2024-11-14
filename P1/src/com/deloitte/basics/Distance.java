package com.deloitte.basics;

import java.util.Scanner;

public class Distance {
     public int km;
     public static int convert(int kilometre) {
 		return kilometre*1000;
 	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value in(km) to Convert to Meters");
		
		Distance d1=new Distance();
		
		d1.km =sc.nextInt();
		
		System.out.println(d1.km+" km is "+convert(d1.km)+" m");
		sc.close();
	}

}
