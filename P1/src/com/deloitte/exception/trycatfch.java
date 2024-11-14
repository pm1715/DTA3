package com.deloitte.exception;

public class trycatfch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=200;
		int num2=10;
//		String str=null;
		int arr[] =new int[5];
		try {
			int result=num1/num2;
			System.out.println(result);
//			System.out.println(str.length());
			System.out.println(arr[6]);
		} catch (ArithmeticException e) {
			
			System.out.println(e);
		}
		catch(NullPointerException e) {
//			System.out.println(e);
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("exiting program");
	}

}
