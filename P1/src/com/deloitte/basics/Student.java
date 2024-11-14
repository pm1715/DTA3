package com.deloitte.basics;

public class Student {

	public  int rolNo;
	public String Name;
	public  void print() {
		 System.out.println(rolNo+" "+Name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s1= new Student();
       s1.rolNo=7;
       s1.Name="Prayansh";
       System.out.println(s1.rolNo+" "+s1.Name);
       Student s2= new Student();
       s2.rolNo=45;
       s2.Name="feforefn";
       System.out.println(s2.rolNo+" "+s2.Name);
		
	}

}
