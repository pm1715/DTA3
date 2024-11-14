package com.deloitte.basics;

public class Employee {

	public int Eid;
	public String Name;
	public String Desg;
	public void print() {
		System.out.println("The Employee id is: "+Eid+"\nThe Name of emplyee is :"+Name+"\nThe Desingation is :"+Desg);
		System.out.println();
	}
	public static void main(String[] args) {
		
		Employee E1=new Employee();
		E1.Eid=1001;
		E1.Name="Prayansh";
		E1.Desg="Analyst";
		E1.print();
		
		Employee E2=new Employee();
		E2.Eid=1321;
		E2.Name="ABCD";
		E2.Desg="Assosicate";
		E2.print();
	}

}
