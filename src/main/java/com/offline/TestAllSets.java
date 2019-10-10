package com.offline;


import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class TestSets{
	
}

public class TestAllSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * HASHSET
		 * 
		 */
		HashSet<String> hs=new HashSet<>();
		hs.add("test");
		hs.add("hash");
		hs.add("set");
		hs.add(null);
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println();
		
		/*
		 * TREESET
		 * 
		 */
		
		TreeSet<String> ts=new TreeSet<>();
		ts.addAll(hs);
		it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
