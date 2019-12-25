package com.offline;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Hashtable;

public class TestAllMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String,Integer>();
		lhm.put("java", 100);
		lhm.put("sql", 50);
		lhm.put(null, 10);
		lhm.put("c", 60);
		lhm.put("java", 90);
		lhm.put(null, 0);
		lhm.put("c++", null);
		lhm.put("dbms", null);
		lhm.put(null, null);
		
		for(Entry<String,Integer> entry:lhm.entrySet()){
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	
	
	/*
	 * 1. order of elements is maintained in the insertion order
	 * 2. can contain only unique elements based on keys, if try to add an element again, it overwrites the existing element
	 * 3. can have only one null key and multiple null values
	 * 	java=90
		sql=50
		null=0
		c=60
		c++=null
		dbms=null

	 * 
	 */
	
		System.out.println();
	//HASHMAP DEMO
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("java", 100);
	hm.put("sql", 50);
	hm.put(null, 10);
	hm.put("c", 60);
	hm.put("java", 90);
	hm.put(null, 0);
	hm.put("c++", null);
	hm.put("dbms", null);
	
	for(Entry<String,Integer> entry:hm.entrySet()){
		System.out.println(entry.getKey()+"="+entry.getValue());
	}
	/*
	 * 1. elements order is not maintained
	 * 2. can contain only unique elements based on keys, if try to add an element again, it overwrites the existing element
	 * 3. can have only one null key and multiple null values
	 * 	null=0
		c++=null
		java=90
		c=60
		dbms=null
		sql=50
	 */
		System.out.println();
	//TREEMAP DEMO
	TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
	tm.put("java", 100);
	tm.put("sql", 50);
	//tm.put(null, 10);
	tm.put("c", 60);
	tm.put("java", 90);
	//tm.put(null, 0);
	tm.put("c++", null);
	tm.put("dbms", null);
	for(Entry<String,Integer> entry:tm.entrySet()){
		System.out.println(entry.getKey()+"="+entry.getValue());
	}
	/*
	 * 1. stores elements in the ascending order of keys
	 * 2. can contain only unique elements based on keys, if try to add an element again, it overwrites the existing element
	 * 3. can't contain null keys
	 * 4. can have multiple null values
	 * 	c=60
		c++=null
		dbms=null
		java=90
		sql=50
	 */
		System.out.println();
	//HASHTABLE DEMO
	Hashtable<String,Integer> ht=new Hashtable<String,Integer>(); 
	ht.put("java", 100);
	ht.put("sql", 50);
	//ht.put(null, 10);
	ht.put("c", 60);
	ht.put("java", 90);
	ht.put("c++", 75);
	ht.put("jenkins", 60);
	//ht.put(null, 0);
	//ht.put("c++", null);
	//ht.put("dbms", null);
	for(Entry<String,Integer> entry:ht.entrySet()){
		System.out.println(entry.getKey()+"="+entry.getValue());
	}
	
	/*
	 * 1. elements order is not maintained
	 * 2. can contain only unique elements based on keys, if try to add an element again, it overwrites the existing element
	 * 3. can't have null keys or null values
	 * 4. Hashtable is synchronized
	 * 	jenkins=60
		java=90
		c++=75
		sql=50
		c=60
	 */
	
	
	}
		
	
	
}
