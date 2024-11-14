package com.deloitte.basics;
import java.util.*;
public class Rectangle {
    public double length;
    public double breadth;
    public double area(double length,double breadth) {
    	return length*breadth;
    }
    public double perimeter(double length,double breadth) {
    	return 2*(length+breadth);
    }
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Rectangle r1= new Rectangle();
		
		System.out.println("Enter the Value for Length (in Decimal)");
		r1.length=sc.nextDouble();
		System.out.println("Enter the Value for breadth (in Decimal)");
		r1.breadth=sc.nextDouble();
		
		System.out.println("The Area of the Rectangle is: "+r1.area(r1.length,r1.breadth));
		System.out.println("The Perimeter of the Rectangle is: "+r1.perimeter(r1.length,r1.breadth));
		sc.close();
	}

}
