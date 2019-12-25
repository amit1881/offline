package com.offline;

public class TestConstructor2 {
	
	static String str;
	
	TestConstructor2(){
		this("java");
	}

	TestConstructor2(String str){
		System.out.println(str +" in parameterized constructor");
		this.str=str;
	}
	
	static void display(){
		String str1="new"+str;
		System.out.println(str1);
	}
	
	//static String str1="new"+str;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructor2 ob=new TestConstructor2();
//		String str1="new"+str;
//		System.out.println(str1);
		display();
	}

}
