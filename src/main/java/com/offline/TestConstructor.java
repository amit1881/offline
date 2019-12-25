package com.offline;


class Parent1{
	String text;
//	Parent1(){
//		System.out.println("parent default constructor");
//		text="hello";
//		System.out.println(text);
//	}
	Parent1(String text){
		System.out.println(text+"--parent param constructor");
	}
}

class Child1 extends Parent1{
//	Child1(){
//		super();
//	}
	Child1(String ch1){
		super("hello");
		System.out.println("child default constructor");
	}
	
	public static void testStatic(){
		System.out.println("inside static method");
		//testInstance(); can't access an instance method in a static one
	}
	
	public void testInstance(){
		System.out.println("inside instance method");
		testStatic();//can access a static method in an instance method
	}
}



public class TestConstructor {
	private TestConstructor(){
		System.out.println("inside private constructor");
	}
	int ins=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child1 obj = new Child1();
		Child1 ob = new Child1("hi");
		//Child1 ob = new Child1();
		System.out.println("text--"+ob.text);
		TestConstructor ob1=new TestConstructor();
		int a=0,b=0,c=0;
		a=b+c;
		ob.testStatic();
		Child1.testStatic();
		ob.testInstance();
		//System.out.println(ins); can't access an instance variable in a static method
	}

}
