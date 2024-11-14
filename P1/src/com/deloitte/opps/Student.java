package com.deloitte.opps;

public class Student {
	public Student() {
		System.out.println("Unknown");
	}
	public Student(String Name) {
		System.out.println(Name);
	}
	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student("prayansh");
		
	}

}
