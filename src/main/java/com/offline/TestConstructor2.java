package com.offline;

public class TestConstructor2 {
	
	TestConstructor2(){
		this("java");
	}

	TestConstructor2(String str){
		System.out.println(str +" in parameterized constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructor2 ob=new TestConstructor2();
	}

}
