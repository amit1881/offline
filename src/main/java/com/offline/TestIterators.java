package com.offline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

class TestFailSafeIterator{
	
	static void testFailSafe(ConcurrentHashMap<Integer,String> chm){
		chm.put(100, "java");
		chm.put(200, "c++");
		chm.put(300, "sql");
		chm.put(400, "dbms");
		
//		for(Map.Entry<Integer, String> entry: chm.entrySet()){
//			System.out.println(entry.getKey()+"="+entry.getValue());
//			chm.put(500, "mysql");
//		}
		
		//Iterator<Integer> it=chm.keySet().iterator();
		Iterator<Entry<Integer, String>> it=chm.entrySet().iterator();
		while(it.hasNext()){
			Entry<Integer, String> en=it.next();
			//System.out.println(key+"="+chm.get(key));
			System.out.println(en.getKey()+"="+en.getValue());
			chm.put(600, "jenkins");
		}
		
	}
	
	static void testFailFast(){
		Map<String, String> m1=new HashMap<String, String>();
		m1.put("1", "test1");
		m1.put("2", "test2");
		m1.put("3", "test3");
		m1.put("4", "test4");
		
		Iterator<Entry<String,String>> it=m1.entrySet().iterator();
		while(it.hasNext()){
			Entry<String,String> en=it.next();
			System.out.println(en.getKey()+"="+en.getValue());
			//m1.put("5", "test5");//This will throw ConcurrentModificationException
			it.remove();//while using iterator method, it won't throw ConcurrentModificationException
		}
		
		
		
	}
	
}

public class TestIterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap<Integer, String> chm=new ConcurrentHashMap<Integer,String>();
		TestFailSafeIterator.testFailSafe(chm);
		System.out.println("Fail Fast Iterator");
		TestFailSafeIterator.testFailFast();
		/* arraylist
		 * 1. maintains insertion order
		 * 2. allow duplicate elements to be stored
		 * 3. allow null values to be stored
		 * 4. implements dynamic array
		 * 5. returns fail-fast iterator
		 */
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("C");
		al.add("c++");
		al.add("java");
		al.add("");
		al.add("sql");
		
		Iterator<String> it=al.iterator(); //FailFast Iterator
		while(it.hasNext()){
			System.out.println(it.next());
			al.add("selenium");   //This will throw ConcurrentModificationException
		}
	}

//	private static void testFailSafe(ConcurrentHashMap<Integer, String> chm) {
//		// TODO Auto-generated method stub
//		
//	}

}
