package com.fita.team2.Collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;



public class TreeSetPrgm {

	public static void main(String[] args) {
		TreeSet<String> mp=new TreeSet<String>();
		mp.add("Ajith");
		mp.add("Logu");
		mp.add("Kamalesh");
		mp.add("Mathu");
		mp.add("Boopathi");
		mp.add("Prasanth");
		mp.add("Dheena");
		mp.add("Logu");
		TreeSet<Integer> mp1=new TreeSet<Integer>();
		mp1.add(12);
		mp1.add(4);
		mp1.add(6);
		mp1.add(3);
		mp1.add(2);
		
		
		System.out.println("PRINTING DECENDING ORDER:");
		System.out.println(mp.descendingSet());
		
		HashSet n=new HashSet(mp);
		
		System.out.println("\nChange order useing HashSet:");
		System.out.println(n);
		System.out.println("\nAssending order using TreeMap:");
		System.out.println(mp);
		System.out.println("\nOVER ALL SMALL VALUEl");
		System.out.println(mp.first());
		
	System.out.println("\nany number < or = value print:");
		System.out.println(mp1.floor(15));
		
	System.out.println("\nPRINTING FIRST VALUE OF INTEX:");
		System.out.println(mp.pollFirst());
		System.out.println("\nPRINTING LAST VALUE OF INTEX:");
		System.out.println(mp.pollLast());
		
		System.out.println("\nHASHCODE:");
		System.out.println(mp.hashCode());
		
		System.out.println("\nHeadset before value:");
				System.out.println(mp1.headSet(4));  //4 before values
			System.out.println("\nTailSet after value:");	
				System.out.println(mp1.tailSet(4));   //4 and 4 after values
			System.out.println("\ninteger ceiling:");	
				
		System.out.println(mp1.ceiling(5));
		
		System.out.println("\nString Ceiling");
		System.out.println(mp.ceiling("Jayaselan"));
		
		 System.out.println("\nenter value after next value");
	System.out.println(mp.higher("Logu"));
		
		
		
		
		
		
		
		

	}

}
