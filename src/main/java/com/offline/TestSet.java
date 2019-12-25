package com.offline;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class TestSet {
	
	public void testHashset(){
		
		/*
		 * 1. doesn't maintain the insertion order
		 * 2. doesn't allow duplicate elements, it overrides the duplicate element
		 * 3. it allows null values
		 */
		
		Set<String> hs=new HashSet<String>();
		hs.add("java");
		hs.add("c sharp");
		hs.add("groovy");
		hs.add("python");
		hs.add(null);
		hs.add("jenkins");
		hs.add("groovy");
		
		/*
		 * Iterate over the set using for each loop 
		 */
		for(String str: hs){
			System.out.println(str);
		}
		
		System.out.println("------------------");
		
		/*
		 * Iterate over the set using iterator
		 */
		
		Iterator it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public void testLinkedHashset(){
		
		/*
		 * 1. it maintains the insertion order
		 * 2. doesn't allow duplicate elements, it overrides the duplicate element
		 * 3. it allows null values
		 */
		
		Set<String> lhs=new LinkedHashSet<String>();
		lhs.add("java");
		lhs.add("c sharp");
		lhs.add("groovy");
		lhs.add("python");
		lhs.add(null);
		lhs.add("jenkins");
		lhs.add("groovy");
		
		System.out.println("-------Linked Hash Set-----------");
		
		for(String str:lhs){
			System.out.println(str);
		}
		System.out.println("----------------------");
		Iterator it=lhs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public void testTreeSet(){
		
		/*
		 * 1. it maintains the ascending order of the elements
		 * 2. doesn't allow duplicate elements, it overrides the duplicate element
		 * 3. it doesn't allow null values
		 */
		
		Set<String> ts=new TreeSet<String>();
		ts.add("java");
		ts.add("c sharp");
		ts.add("groovy");
		ts.add("python");
		//ts.add(null);
		ts.add("jenkins");
		ts.add("groovy");
		System.out.println("------------Tree Set-------------");
		for(String str:ts){
			System.out.println(str);
		}
		System.out.println("-------------");
		Iterator it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static void main(String str[]){
		TestSet ob=new TestSet();
		ob.testHashset();
		ob.testLinkedHashset();
		ob.testTreeSet();
	}

}
