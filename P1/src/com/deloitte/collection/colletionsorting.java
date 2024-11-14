package com.deloitte.collection;
import java.util.*;
class Student implements Comparable<Student>{
	int rollno;
	String Name;
	public Student(int rollno,String Name) {
		this.rollno=rollno;
		this.Name=Name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", Name=" + Name + "]";
	}
	@Override
	public int compareTo(Student o) {
		if(this.rollno>o.rollno) {
			return 1;
		}
		return -1;
	}

}
public class colletionsorting {

	public static void main(String[] args) {
		List<Student> studentlist = new ArrayList<Student>();
		studentlist.add(new Student(21,"john"));
		studentlist.add(new Student(20,"alex"));
		studentlist.add(new Student(1,"surya"));
		studentlist.add(new Student(15,"akash"));
		System.out.println(studentlist);
		//		Collections.sort(studentlist);
		Comparator<Student> comp= new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				if(o1.rollno>o2.rollno) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		Collections.sort(studentlist,comp);
		System.out.println(studentlist);
		
		System.out.println();
		
		Collections.sort(studentlist);
		System.out.println(studentlist);

		
	}

}
