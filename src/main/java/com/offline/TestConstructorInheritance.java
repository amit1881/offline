package com.offline;

class ParentA{
	
	ParentA(){
		System.out.println("parent class constructor");
	}
}

class ChildB extends ParentA{
	
	ChildB(){
		System.out.println("child class constructor");
	}
}


public class TestConstructorInheritance {
	
	
	public static void main(String a[]){
	ChildB ob=new ChildB();
	}
}
