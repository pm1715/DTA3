package com.deloitte.basics;
import com.deloitee.info.*;
public class acess_modifiers {
	public static String one="public";
	private static String two="private";
	protected static String three="protected";
	static String four ="default";


	public static void main(String[] args) {
		System.out.println("I am a the class where all variables are declared and i can access: ");
		System.out.println(acess_modifiers.one+","+acess_modifiers.two+","+acess_modifiers.three+","+acess_modifiers.four);
		System.out.println();
		acess_1.printDiffClass();
		System.out.println();
		check.printDiffpack();
		
	}

}
