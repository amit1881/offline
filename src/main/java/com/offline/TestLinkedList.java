package com.offline;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class ALinkedList{
	int a;
	String  str;
	ALinkedList(int a, String str){
		this.a=a;
		this.str=str;
	}
}

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ALinkedList a1=new ALinkedList(10, "test1");
		ALinkedList a2=new ALinkedList(20, "test2");
		
		LinkedList<ALinkedList> ob=new LinkedList<ALinkedList>();
		ob.add(a1);
		ob.add(a2);
		ob.add(a2);
		for(ALinkedList al:ob){
			System.out.println(al.a+" "+al.str);
		}
		System.out.println();
		List<ALinkedList> ob1=new LinkedList<ALinkedList>();
		ob1.addAll(ob);
		ListIterator<ALinkedList> lit=ob1.listIterator();
		while(lit.hasNext()){
			ALinkedList al=lit.next();
			System.out.println(al.a+" "+al.str);
		}
	}

}
