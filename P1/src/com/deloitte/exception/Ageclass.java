package com.deloitte.exception;
import java.util.*;
public class Ageclass {
	static void age(int age) throws AgeExeption {
		if(age>25 && age<40) {
			System.out.println("Your age is correct");
		}
		else {
			throw  new AgeExeption("You Age lies in range that is not allowed");
			 
		}
	}

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			try {
				System.out.println("Enter Your age");
			int age=sc.nextInt();
				age(age);
			} catch (AgeExeption e) {
				
				e.printStackTrace();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Do you wish to continue?? (y/n)");
			char ch=sc.next().charAt(0);
			if(ch=='n') {
				break;
			}
		}
		try(Scanner sb= new Scanner(System.in)){
			System.out.println("automatically closed sb");
		}
		
		
	}

}
