package com.offline;

public class TestStringIntern{

	public static void main(String a[]){
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		System.out.println(s2.equals(s3));
		System.out.println(s2==s3);
		/*
		 * 
		 * String- Intern Method
		 * 
		 */
		
		String s4=s2.intern();
		System.out.println(s2.equals(s4));
		System.out.println(s2==s4);
	}
}
