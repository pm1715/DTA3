package com.deloitte.collection;
import java.util.*;
public class Seta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Club");
		String username;
		char choice='y';
		int choice2=0;
		int plan=0;
		
		
		LinkedHashSet<String> LinkedHash= new LinkedHashSet<String>();
		LinkedHash.add("prayansh1");
		LinkedHash.add("john34");
		LinkedHash.add("jonny12");
		
		
		ArrayList<String> AL=new ArrayList<String>(LinkedHash);
		ArrayList<List> temp=new ArrayList<List>();
		temp.add(Arrays.asList("name : prayansh ", "qualifaction : Btech "));
		temp.add(Arrays.asList("name : john ", "qualifaction : Mtech "));
		temp.add(Arrays.asList("name : johnny ", "qualifaction : MBA "));
		while(choice=='y') {
			System.out.println("Enter your username");
			username=sc.next();
			if(LinkedHash.contains(username)) {
				System.out.println("Welcome back! \nWhat do you want to do?\n1:change username \n2:retrive information");
				choice2=sc.nextInt();
				if(choice2==1) {
					LinkedHash.remove(username);
					int index1=AL.indexOf(username);
					System.out.println("enter your new username");
					username=sc.next();
					AL.set(index1, username);
					LinkedHashSet<String> new1 = new LinkedHashSet<>(AL);
					LinkedHash=new1;
					System.out.println("your username is changed successfully ");
//					System.out.println(L);
//				
				}
				else if(choice2==2) {
					System.out.println("choose your plan\n1 : FREE \n2: Premium ");
					plan=sc.nextInt();
					if(plan ==1) {
						System.out.println(" sorry you need a premium plan to acccess data");
					}
					else if(plan ==2) {
						int index=AL.indexOf(username);
						System.out.println(username);
						System.out.println(temp.get(index));
					}
				}
			}
			else {
				System.out.println("invalid username");
			}
			System.out.println("do you want to continue y/n");
			choice=sc.next().charAt(0);
		}

	}

}
