package com.deloitte.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Examle_on_Arraylist {
	static int Ddouble(int a) {
		return a*a;
	}
	
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>();
        l.add(10);
        l.add("hello world");
        l.add(9.5);

        System.out.println("I am a heterogeneous list \n" + l);

        List<Integer> l1 = new ArrayList<>();
        l1.add(100);
        l1.add(300);
        l1.add(600);

        
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        ListIterator<String> iterator = list.listIterator(list.size());

       
        System.out.println("Iterating in reverse order:");
        while (iterator.hasPrevious()) {
            String element = iterator.previous();  
            System.out.println(element);
        }
        System.out.println();
        
       list.forEach(n->System.out.print(n));
       System.out.println("----------------------------------------------------");
       ArrayList<Integer> AL= new ArrayList<>();
       AL.add(8);
       AL.add(34);
       AL.add(12);
       AL.add(45);
       System.out.println();
       System.out.println(AL);
       
       int max = Collections.max(AL);
       System.out.println("this is the largest number in arraylist :"+max);
       int d = Ddouble(max);
     
       System.out.println();
       System.out.println("i am its double :"+d);
       System.out.println("aftter replacing the Maxnunmber with its double");
       ListIterator<Integer> ALI = AL.listIterator();
       while(ALI.hasNext()) {
    	   if(ALI.next()==max) {
    		   AL.set(AL.indexOf(max),d);
    	   }
       }
       
       System.out.println(AL);
      
    }
}
