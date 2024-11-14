package com.deloitte.poly;
import java.util.*;
public class child extends parent{

	@Override
	public int addition(int a,int b) {
		System.out.println("You called the function for abosulte addtion");
		return Math.abs(a)+Math.abs(b);
	}


}
