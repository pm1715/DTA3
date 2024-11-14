package com.deloitte.abstraction;
import java.util.*;
public class Mainone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Flipkart f = new Flipkart();
		Amazon a = new Amazon();
		Myntra m = new Myntra();
		OnlineRetial o= new Flipkart();
		
		
		char c='y';
		while(c=='y') {
			System.out.println("Enter the Number of items you want");
			int unit=0;
			unit=sc.nextInt();
			int cost=unit*100;
		    System.out.println("Enter the Name of your Retailer ");
			String retial=sc.next();
			if(retial.equals("flipkart") && cost>1000) {
				f.Amount=cost;
				System.out.println("the amount to be paid is : "+(cost-f.adddiscount()));
			}
			else if(retial.equals("amazon") && cost>1000) {
				a.Amount=cost;
				System.out.println("the amount to be paid is : "+(cost-a.adddiscount()));
			}
			else if(retial.equals("myntra") && cost>1000) {
				m.Amount=cost;
				System.out.println("the amount to be paid is : "+(cost-m.adddiscount()));
			}
			else if(cost<1000) {
				o.Amount=cost;
				System.out.println("The Amount to be paid is "+(cost-o.discount()));
			}
			System.out.println();
			System.out.println();
			System.out.println("Do you wish to contiue to know more about different retailers? \ny - Yes and n - No,");
			c=sc.next().charAt(0);
			System.out.println();
		}

		
		
	}

}
