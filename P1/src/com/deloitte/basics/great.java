package com.deloitte.basics;

import java.util.Scanner;

public class great extends Distance {
	public static int greatest(int a,int b,int c) {
        if(a>b && a>c) {
        	return a;
        }
        else if(b>a && b>c) {
        	return b;
        }
        else {
        	return c;
        }
}

	public static void main(String[] args) {
		Distance d1=new Distance();
		System.out.println(d1.km);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The First Number :");
		int num1=sc.nextInt();
		System.out.println("Enter The Second Number :");
		int num2=sc.nextInt();
		System.out.println("Enter The Third Number :");
		int num3=sc.nextInt();
		System.out.println("The greatest amongst "+num1+","+num2+","+num3+" is : "+greatest(num1,num2,num3));
		sc.close();
	}

}
