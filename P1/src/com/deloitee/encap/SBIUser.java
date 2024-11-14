package com.deloitee.encap;

import java.util.*;

public class SBIUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SBI_Bank u1= new SBI_Bank();
		System.out.println("Welcome to SBI \nEnter Your User Name :");
		u1.User_Name=sc.next();
		System.out.println("Enter your password");
		u1.password=sc.next();
		int choice=0;
		int deposit=0;
		int withdraw=0;
		int balance=0;
		String c="y";
		while(c.equals("y")) {
			if(u1.User_Name.equals("prayansh") && u1.password.equals("1234")) {
				System.out.println("What do want to perfrom Select from below :\n1: Deposit\n2: Withdraw ");
				choice=sc.nextInt();
				if(choice==1) {
					System.out.println("You choose to Depsot Now Enter the Amount to deposit :");
					deposit=sc.nextInt();
					balance=u1.getBalance()+deposit;
					u1.setBalance(balance);
					System.out.println("Transaction successfull , Your balance is "+u1.getBalance());
				}
				else if(choice ==2) {
					System.out.println("You choose to Withdarw Enter the Amount to withdraw");
					withdraw=sc.nextInt();
					balance=u1.getBalance();
					if(withdraw>=balance) {
						System.out.println("Transaction Declined you do not have suffiecent amount in your account");
					}
					else {
						u1.setBalance(balance-withdraw);
						System.out.println("Transaction successfull , Your balance is "+u1.getBalance());
					}
				}
				
			}
			else {
				System.out.println("invalid username or password");
			}
			System.out.println("Would you choose to continue ? (y - Yes and n - No)");
			c=sc.next();
		}

	}

}
