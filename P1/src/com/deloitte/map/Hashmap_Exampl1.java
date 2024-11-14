package com.deloitte.map;
import java.util.*;
public class Hashmap_Exampl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> user= new HashMap<>();
		user.put("pm01","prayansh");
		user.put("ab34", "abcd");
		user.put("j456", "john");
		
		ArrayDeque<String> songs = new ArrayDeque<String>();
		songs.push("closer");
		songs.push("all we know");
		songs.push("cheap thrills");
		
		HashMap<String,ArrayDeque> usersong= new HashMap<String,ArrayDeque>();
		usersong.put("pm01",songs);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Sound ! \nEnter your user name ");
		String username=sc.next();
		if(user.containsKey(username)) {
			System.out.println("welcome what do you want to do?? \n1:change name\n2:change username \n3:enter new song");
			int choice= sc.nextInt();
			if(choice==1) {
				System.out.println("enter your new name ");
				String new1 = sc.next();
				user.replace(username, new1);
				System.out.println("Your new name is :"+ user.get(username));
			}
			else if(choice==2) {
				String val=user.get(username);
				user.remove(username);
				System.out.println("enter your new username :");
				username=sc.next();
				user.put(username, val);
				System.out.println("your user name was changed to : "+username);
				System.out.println(user);
			}
			else if(choice==3) {
				System.out.println("you have choosen to enter  new songs to your queue");
				System.out.println("This is your current song Queue :\n"+ usersong.values());
				System.out.println("Do you enter a new song (y/n) ");
				String temp=sc.next();
				if(temp.equals("y")) {
					System.out.println("what is the new song ?");
					String newsong=sc.next();
					System.out.println("Do you want to listen this song now or later ?");
					String pos=sc.next();
					if(pos.equals("now")) {
						songs.addFirst(newsong);
					}
					else if(pos.equals("later")) {
						songs.addLast(newsong);
					}
					usersong.replace(username, songs);
					System.out.println(usersong.values());
				}
				
			}
		}
		else {
			System.out.println("Invalid useranem");
		}
	}

}
