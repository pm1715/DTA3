package com.deloitte.basics;
import java.util.*;

public class hands_on_2 {
    public static double discount(double cost) {
    	return cost*0.1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of units " );
		int units=sc.nextInt();
		double cost = units*100;
		if(cost>=1000) {
			cost=cost - discount(cost);
			System.out.println("You got a 10% Discount");
			System.out.println("The final cost of "+units+" units is :Rs "+ cost );
		}
		else {
		    System.out.println("The final cost of "+units+" units is :Rs "+ cost );
		}
		sc.close();
	}
}
