package com.deloitte.opps;
import java.util.*;
public class Hands_on_method {
	public static int add(int a,int b) {
		return a+b;
	}
	public static String add(String a,String b) {
		return a+b; 
	}
 
	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      int choice=0;
    	  System.out.println("Enter your choice: \n1 : integer \n2 : String");
          choice=sc.nextInt();
    	  if(choice==1) {
        	  System.out.println("You choose integer now enter Two Number to ADD");
        	  System.out.println("Enter the first Integer");
        	  int a= sc.nextInt();
              System.out.println("Enter the second Integer");
              int b= sc.nextInt();
        	  System.out.println("The Sum of Two Numbers is :"+add(a,b));
          }
          else if(choice==2) {
        	  System.out.println("You choose String now enter Two Strings to CONCATENATE");
        	  System.out.println("Enter the first String");
        	  String a= sc.next();
        	  System.out.println("Enter the second String");
        	  String b= sc.next();
        	  System.out.println("The two Strings after concatenation is :"+add(a,b));
          }
          else {
        	  System.out.println("invlaid Input");
          }
          sc.close();
      
      
	}

}
