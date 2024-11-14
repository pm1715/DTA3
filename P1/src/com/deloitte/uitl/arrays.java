package com.deloitte.uitl;
import java.util.*;
public abstract class arrays {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,56,23,43,15,67,8,95};
		System.out.println("before sorting");
		for(int i :arr) {
			System.out.print(i+" ");
		}
		Arrays.sort(arr);
		System.out.println("\nafter sorting");
		for(int i :arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(arr, 15));
		int arr1[]= {1,2,3,4,5};
		System.out.println(Arrays.equals(arr, arr1));
		int[] arr3=Arrays.copyOf(arr,3);
		
		
	
	}

}
