package com.deloite.ine;
import java.util.*;
public class Grade_5 implements education{
	double mark1;
	double mark2;
	double mark3;
	double mark4;
	Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double aggreate() {
		System.out.println("You choose grade 10 Now enter Marks of you 6 subjects: ");
    	System.out.println("Enter marks of First Subject (out of 100) :");
    	mark1=sc.nextInt();
    	System.out.println("Enter marks of Second Subject (out of 100) :");
    	mark2=sc.nextInt();
    	System.out.println("Enter marks of third Subject (out of 100) :");
    	mark3=sc.nextInt();
    	System.out.println("Enter marks of Fourth Subject (out of 100) :");
    	mark4=sc.nextInt();
	       return ((mark1+mark2+mark3+mark4)/400)*100;
			
		}

}
