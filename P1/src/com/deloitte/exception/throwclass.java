package com.deloitte.exception;

public class throwclass {
	static void method() throws Exception {
		String str="hello";
		if(str.equals("hello")) {
			throw new helloStringException();
		}
		System.out.println(str.length());
	}
	public static void main(String[] args) throws NullPointerException {
		System.out.println("hello");

		try {
			method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ko");
		
	}

}
