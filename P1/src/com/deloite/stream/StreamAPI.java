package com.deloite.stream;
import java.util.*;
import java.util.stream.Stream;
public class StreamAPI {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(7);
		list.add(9);
		list.add(25);
		list.add(13);
		list.add(18);
		list.forEach(n->System.out.print(n+" "));
		
		System.out.println();
		Stream<Integer> stream=list.stream();
//		System.out.println("Count of elements "+stream.count());
//		stream.sorted().forEach(n->System.out.print(n+" "));
		System.out.println();
//		stream.map(n->n*2).forEach(n->System.out.print(n+" "));
		
//		stream.filter(n->n%2==0).map(n->n*2).forEach(n->System.out.print(n+" "));
		
		Random random = new Random();
		random.doubles().limit(5).sorted().map(n->n*10).map(n->(int)n).forEach(n->System.out.println(n));
		System.out.println(stream.anyMatch(i->i==10));
		
		List<Integer> list2 = new ArrayList<Integer>();
		System.out.println();
		for(int i=1;i<5;i++) {
			list2.add(random.nextInt(100 ));
		}
		list2.forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println("below is stream operated");
		Stream<Integer> stream2=list2.stream();
		stream2.sorted().filter(n->n%2==0).map(n->n*2).forEach(n->System.out.print(n+" "));
		
		
		List<String> list3 = new ArrayList<>();
		list3.add("prayansh");
		list3.add("abcds");
		list3.add("john");
		
		System.out.println();
		
		Stream<String> stream3= list3.stream();
		
		stream3.sorted().filter(s->s.startsWith("p")).map(s->s.replace(s, "new")).forEach(n->System.out.println(n));
		
		
		
		
		
	}

}
