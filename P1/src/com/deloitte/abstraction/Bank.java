package com.deloitte.abstraction;

public abstract class Bank {
	public void doCredit() {
		System.out.println("bank credit operation");
	}
	public void doDebit() {
		System.out.println("bank debit operation");
	}
	public abstract void intrestRateonSB() ;
	
	
	public static void main(String[] args) {

	}

}
