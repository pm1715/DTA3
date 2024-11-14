package com.deloite.ine;

import java.util.*;

public class mainone {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
    Grade_5 f=new Grade_5();
    Grade_10 t=new Grade_10();
    System.out.println("Enter Your Grade (5/10):");
    int grade=sc.nextInt();
    double agg=0;
    if(grade==5) {
    	agg=f.aggreate();
    	if(agg>=75) {
    		System.out.println("Congratualations You have Passed with : "+agg+" aggreatie ");
    	}
    	else {
    		System.out.println("Sorry You failed with : "+agg+" agg");
    	}
    }
    else if(grade==10) {
    	agg=t.aggreate();
    	if(agg>=75) {
    		System.out.println("Congratualations You have Passed with : "+agg+" aggreatie ");
    	}
    	else {
    		System.out.println("Sorry You failed with : "+agg+" agg");
    	}
    }
    else {
    	System.out.println("invalid input");
    }
	}

}
