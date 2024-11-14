package com.deloitte.opps;

public class mainone {
 
	public static void main(String[] args) {
		
		Employee employee1= new Employee();
		employee1.Name="Prayansh";
		employee1.Age=22;
		employee1.Phone_Number=999999999;
		employee1.Address="Raipur";
		employee1.Salary=123456;
		Employee.Specialization="Cloud";
		
		employee1.printDetails();
		Employee.printspec();
		System.out.println();
		System.out.println();
		
		Manager manager1= new Manager();
		manager1.Name="abcd";
		manager1.Age=32;
		manager1.Phone_Number=999999999;
		manager1.Address="delhi";
		manager1.Salary=89767;
		Manager.department="Taxation";
		
		manager1.printDetails();
		Manager.printdept();

	}

}
