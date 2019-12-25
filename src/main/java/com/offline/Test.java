package com.offline;



class Test1 {

	public static String foo(){
		System.out.println("Test foo called");
		return "";
	}
	
//	public static void main(String args[]){
//		Test obj = null;
//		System.out.println(obj.foo());
//	}
}



public class Test {

	public static String toString1(){
		System.out.println("Test toString called");
		return "";
	}
	
	public static void main(String args[]){
		System.out.println(toString1());
		Test1 obj=null;
		System.out.println(obj.foo());
	}
}

