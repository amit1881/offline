package com.offline;

public class TestMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hello";
		System.out.println(str.hashCode());
		str.concat(" world");
		System.out.println(str.hashCode());
		System.out.println(str);
		str=str.concat(" world");
		System.out.println(str.hashCode());
		System.out.println(str);
//		String str1=str.concat(" world");
//		System.out.println(str1);
		
		//String Buffer class
		StringBuffer sb=new StringBuffer("hello string");
		System.out.println(sb.hashCode());
		sb.append(" buffer");
		System.out.println(sb.hashCode());
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.getClass());
		
		StringBuffer sb1=new StringBuffer();
		sb1.append("string buffer class");
		System.out.println(sb1);
		
		
		//String Builder class
		StringBuilder sb2=new StringBuilder();
		StringBuilder sb3=new StringBuilder("test1");
		sb2.append("string builder class");
		System.out.println(sb2);
		sb3.append(" string builder class");
		System.out.println(sb3);
	}

}
