package com.offline;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

public class TestCharacterFrequency {

	private static void countCharFrequency(String str){
		char[] a=str.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<a.length;i++){
			int count=1;
			if(hm.containsKey(a[i])){
				hm.put(a[i], hm.get(a[i])+1);
			}
			else{
				hm.put(a[i], count);
			}
		}
		
		for(Entry<Character,Integer> en:hm.entrySet()){
			System.out.println(en.getKey()+"::"+en.getValue());
		}
		
		Iterator<Character> it=hm.keySet().iterator();
		while(it.hasNext()){
			Character key=it.next();
			if(hm.get(key)>1){
				it.remove();
			}
		}
		System.out.println("unique="+hm.keySet().toString());
		System.out.println();
		ArrayList<Character> al=new ArrayList<Character>();
		for(Entry<Character,Integer> en:hm.entrySet()){
			System.out.println(en.getKey()+"::"+en.getValue());
			al.add(en.getKey());
		}
		
		System.out.println(al);
	}
	
	private static void countCharFrequencyUsingLinkedHashMap(String str){
		char[] a=str.toCharArray();
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<a.length;i++){
			int count=1;
			if(hm.containsKey(a[i])){
				hm.put(a[i], hm.get(a[i])+1);
			}
			else{
				hm.put(a[i], count);
			}
		}
		
		for(Entry<Character,Integer> en:hm.entrySet()){
			System.out.println(en.getKey()+"::"+en.getValue());
		}
		
		Iterator<Character> it=hm.keySet().iterator();
		while(it.hasNext()){
			Character key=it.next();
			if(hm.get(key)>1){
				it.remove();
			}
		}
		System.out.println();
		String newstr = "";
		ArrayList<Character> al=new ArrayList<Character>();
		for(Entry<Character,Integer> en:hm.entrySet()){
			System.out.println(en.getKey()+"::"+en.getValue());
			al.add(en.getKey());
			newstr=newstr.concat(en.getKey().toString());
		}
		
		System.out.println(al);
//		Object[] ob=al.toArray();
//		for(int i=0;i<ob.length;i++){
//			newstr=newstr.concat(ob[i].toString());
//		}
		System.out.println(newstr);
	}
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string::");
		String str=br.readLine();
		
		System.out.println("Enter a character::");
		char ch=(char)br.read();
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				count++;
			}
		}
		System.out.println("Number of occurrences of "+ch+"="+count);
		
		System.out.println();
		countCharFrequency(str);
		System.out.println();
		countCharFrequencyUsingLinkedHashMap(str);
		
	}

}
