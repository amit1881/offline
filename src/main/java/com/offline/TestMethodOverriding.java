package com.offline;

class A1{
	
	 void display(){
		System.out.println("method in a1");
	}
	 
	 void display1(){
		 System.out.println("another method in a1");
	 }
	
	 static void dispalyStatic(){
		 System.out.println("static method in a1");
	 }
	 
}

class B1 extends A1{
	
	void display(){
		System.out.println("method in b1");
		//super.display();
	}
	
	static void dispalyStatic(){
		 System.out.println("static method in b1");
	 }
}

public class TestMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 ob=new B1();
		ob.display();
		ob.display1();
		A1 a1=new B1();
		a1.display();
		a1.display1();
		
		A1 a2=new A1(); 
		a2.display();
		System.out.println();
		
		ob.dispalyStatic();
	    a1.dispalyStatic();
		
	}

}
