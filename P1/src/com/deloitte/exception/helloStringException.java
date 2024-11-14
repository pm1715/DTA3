package com.deloitte.exception;

public class helloStringException extends Exception {
	static void method() {
		System.out.println("hello not allowed");
	}
	public static void main(String[] args) {
	method();
	}
}
