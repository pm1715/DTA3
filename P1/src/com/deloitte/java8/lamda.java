package com.deloitte.java8;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
@FunctionalInterface
interface A1{
	int calc(int a,int b);
}
@FunctionalInterface
interface B1{
	int stringlegnth(String s);
}
public class lamda {

	public static void main(String[] args) {
		A1 add=(a,b)->a+b;
		A1 mul=(a,b)->a*b;
		A1 sub=(a,b)->a-b;
		A1 div=(a1,b1)->a1/b1;
		System.out.println(add.calc(3,4));
		System.out.println(sub.calc(3,4));
		System.out.println(mul.calc(3,4));
		System.out.println(div.calc(3,4));
		System.out.println();
		B1 b=s->s.length();
		System.out.println(b.stringlegnth("hello"));
		
		Consumer<String> print = n->System.out.println(n);
		print.accept("string");
		
		Supplier<String> gety = ()->"hello";
		System.out.println(gety.get());
		
		Predicate<String> len =n->n.length()>5;
		System.out.println(len.test("hgel"));
		
		Function<String, Integer> lengfun= (n)->n.length();
		System.out.println(lengfun.apply("hello"));
		
		
		
	}

} 
