package com.offline;

import java.util.Arrays;

public class TestAnagramString {
	
	static void isAnagram(String s1,String s2){
		s1=s1.replaceAll("\\s", "");
		System.out.println(s1);
		s2=s2.replaceAll("\\s", "");
		System.out.println(s2);
		boolean status=true;
		if(s1.length()!=s2.length()){
			status=false;
		}
		else
		{
			char[] a1=s1.toCharArray();
			char[] a2=s2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			status=Arrays.equals(a1, a2);
		}
		
		if(status){
			System.out.println(s1+" and "+s2+" are anagrams");
		}
		else
			System.out.println(s1+" and "+s2+" are not anagrams");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAnagram("loop","pool");
		isAnagram("dog","god");
		isAnagram("keep","peek");
		isAnagram("laptop","leaptop");
		isAnagram("magic","magic");
		isAnagram("automation testing","automatic testing");
	}

}
