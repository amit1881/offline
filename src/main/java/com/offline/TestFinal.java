package com.offline;

import java.util.*;

class Parent{
	String text;
	final String PAN_CARD_NUMBER;//can be initialized only in constructor
	//PAN_CARD_NUMBER="1234"; //can't initialized like this
	Parent(String text, String PAN_CARD_NUMBER){
		System.out.println(text+"--Parent");
		this.text=text;
		this.PAN_CARD_NUMBER=PAN_CARD_NUMBER;
	}
	
	String getText(){
		return text;
	}
}

class Child extends Parent{
	static final int a;
	//only public, protected & private are permitted with constructor
	Child(String text) {
		super(text,"");
		// TODO Auto-generated constructor stub
		System.out.println(text+"--Child");
	}
	static{
		a=10;
	}
	
	public void cal(final int n){
		System.out.println(n*n);
		/* The final local variable n cannot be assigned. It must be blank and not using a compound assignment
		 n=5;
		 n=n+5;
		*/
	}
}

public class TestFinal {
	final List<String> flistofstrings = new ArrayList<String>();
	final String fstr;
	TestFinal(List<String> flistofstrings, String fstr){
		this.flistofstrings.addAll(flistofstrings);
		this.fstr = fstr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List<String> listofstrings = new ArrayList<String>();
		listofstrings.add("s1");
		listofstrings.add("s2");
		//listofstrings = new ArrayList<String>();
		for(String str : listofstrings){
			System.out.println(str);
		}
		
		final String str;
		str="s2";
		//str="s1";
		
		String str1=new Child("hello").getText();
		System.out.println(str1);
		System.out.println(Child.a);
		new Child("hello").cal(5);
        
	}
        
}
