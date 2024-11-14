package com.deloitte.collection;
import java.util.*;
class Person implements Comparable<Person> {
	String Firstname;
	String Lastname;
	int age;
	Person(String Firstname,String Lastname,int age){
		this.Firstname=Firstname;
		this.Lastname=Lastname;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Person [Firstname=" + Firstname + ", Lastname=" + Lastname + ", age=" + age + "]";
	}
	
	
	@Override
	public int compareTo(Person o) {
		if(this.age>o.age) {
			return 1;
		}
		return -1;
	}

}

public class Comp_Example {

	public static void main(String[] args) {
		List<Person> p1= new ArrayList<>();
		p1.add(new Person("prayansh","mishra",22));
		p1.add(new Person("akash","arora",27));
		p1.add(new Person("andrew","simons",78));

//		Comparator<Person> comp= new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				if(o1.age>o2.age) {
//					return 1;
//				}
//				return 0;
//			}
//		};
		Comparator<Person> comp1= new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.Firstname.compareTo(o2.Firstname);
			}
		};
		Comparator<Person> comp2= new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.Lastname.compareTo(o2.Lastname);
			}
		};
		System.out.println("sorting on the basis of age");
		Collections.sort(p1);
//		System.out.println(p1);
		for(Person e : p1) {
			System.out.println(e);
		}
		
		System.out.println();
		
		System.out.println("sorting on the basis of firstname");
		Collections.sort(p1,comp1);
		for(Person e : p1) {
			System.out.println(e);
		}
		
		System.out.println();
		
		System.out.println("sorting on the basis of lastname");
		Collections.sort(p1,comp2);
		for(Person e : p1) {
			System.out.println(e);
		}


	}

}
