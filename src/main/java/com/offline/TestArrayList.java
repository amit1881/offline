package com.offline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class ACollection{
	int a;
	String str;
	
	ACollection(int a, String str){
		this.a=a;
		this.str=str;
	}
	
	void test(){
		ArrayList al=new ArrayList();
		al.add(1);
		al.add("amit");
		al.add(null);
		al.add("#");
		al.add(1.5);
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ACollection a1=new ACollection(10, "test1");
		ACollection a2=new ACollection(20, "test2");
		ACollection a3=new ACollection(30, "test3");
		ACollection a4=new ACollection(40, "test4");
		ACollection a5=new ACollection(50, "test5");
		
		ArrayList<ACollection> ob=new ArrayList<ACollection>();
		ob.add(a1);
		ob.add(a2);
		ob.add(a3);
		ob.add(a4);
		ob.add(a5);
		a1.test();
		System.out.println();
		
		for(ACollection ac:ob){
			System.out.println(ac.a+" "+ac.str);
		}
		
		System.out.println();
		
		
		Iterator<ACollection> it=ob.iterator();
		while(it.hasNext()){
			ACollection ac=it.next();
			System.out.println(ac.a+" "+ac.str);
			
		}
		
		System.out.println();
		
		ListIterator<ACollection> lit=ob.listIterator();
		while(lit.hasNext()){
			ACollection ac=lit.next();
			System.out.println(ac.a+" "+ac.str);
		}
		
		System.out.println();
		//get the enumeration object
		Enumeration<ACollection> en=Collections.enumeration(ob);
		while(en.hasMoreElements()){
			ACollection ac=en.nextElement();
			System.out.println(ac.a+" "+ac.str);
		}
		
		List<ACollection> ob1=new ArrayList<ACollection>();
		ob1.add(a1);
		ob1.add(a2);
		ob1.add(a3);
		ob1.addAll(ob);
		ob1.addAll(ob1);
		
		System.out.println();
		
		for(ACollection ac: ob1){
			System.out.println(ac.a+" "+ac.str);
		}
		System.out.println();
		List<String> ob2=new ArrayList<String>();
		ob2.add("tester");
		ob2.add("devops");
		ob2.add("developer");
		for(String str:ob2){
			System.out.println(str);
		}
		
		
		System.out.println();
		List ob3=new ArrayList();
		ob3.add("string");
		ob3.add(100);
		ob3.add('a');
		
		for(Object obj:ob3){
			System.out.println(obj);
		}
		
		System.out.println("ARRAY LIST EXAMPLE");
		ArrayList<String> al=new ArrayList<String>(5);
		al.add("tcs");
		al.add("gl");
		al.add("tcs");
		al.add(null);
		al.add("hcl");
		al.add("gl");
		al.add(null);
		
		for(String str:al){
			System.out.println(str);
		}
		
		HashSet<String> hswd=new HashSet<String>();
		for(String str:al){
			if(hswd.add(str)==false){
				System.out.println("Duplicate element="+str);
			}
			if(hswd.add(str)){
				hswd.add(str);
			}
		}
		System.out.println(hswd);
		
		HashSet<String> hs=new HashSet<String>(al);
		ArrayList<String> alwd=new ArrayList<String>(hs);
		System.out.println("ARRAY LIST WITHOUT DUPLICATE ELEMENTS");
		for(String str:alwd){
			System.out.println(str);
		}
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>(al);
		ArrayList<String> alwd1=new ArrayList<String>(lhs);
		System.out.println("ARRAY LIST WITHOUT DUPLICATE ELEMENTS USING LINKEDHASHSET");
		for(String str:alwd1){
			System.out.println(str);
		}
	}

}
