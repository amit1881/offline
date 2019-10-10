package com.offline;

public class TestSwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "java";  
        String b = "application";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
	}

}
