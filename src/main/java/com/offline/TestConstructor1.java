package com.offline;


class TestParent{
	
	TestParent(){
		System.out.println("inside parent constructor");
	}
	
	TestParent(String parent){
		System.out.println(parent+" parameterized constructor");
	}
	
}

class TestChild extends TestParent{
	TestChild(){
		this("child1");
		System.out.println("inside child constructor");
	}
	
	TestChild(String child){
		//super("parent1");
		System.out.println(child+" parameterized constructor");
	}
}


public class TestConstructor1 {
	
	public static void main(String a[]){
	//every time we call the child class constructor, it will by default call the parent class default constructor first
	//TestChild ob=new TestChild();
	//every time we call the child class constructor, it will by default call the parent class default constructor first
	TestChild ob1=new TestChild("child");
	
	}

}
