package com.offline;

public class TestStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="this is a java application";
		System.out.println(str);
		System.out.println(str.replaceAll("\\s", ""));
		System.out.println(str);
		str=str.replaceAll("\\s", "");
		System.out.println(str);

		String str1="this is a string method";
		System.out.println(str1);
		System.out.println(str1.replace("this", "That"));
	}

}
