package com.offline;


interface I1{
	static void test(){
		
	}
    default void test1(){
		
	}
	void sum();
	void sum(int a,int b);
	
}

interface I2{
	void sub();
	void sub(int a,int b);
}

interface I3{
	void mul();
	void mul(int a,int b);
}
//MULTIPLE INHERITANCE
class ImplementI1 implements I1,I2,I3{

	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("Hello sum");
	}

	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
	
	public void sub(){
		System.out.println("Hello sub");
	}
	
	public void sub(int a, int b){
		System.out.println(a-b);
	}

	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Hello mul");
	}

	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}
	
}
//MULTIPLE INHERITANCE
interface I4 extends I1,I2,I3{
	
}

class ImplementI4 implements I4{

	public void sum() {
		// TODO Auto-generated method stub
	System.out.println("hi sum");	
	}

	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("hi sub");
	}

	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}

	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("hi mul");
	}

	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}
	
}

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementI1 ob=new ImplementI1();
		ob.sum();
		ob.sum(1,2);
		ob.sub();
		ob.sub(5, 3);
		ob.mul();
		ob.mul(3,4);
		
		ImplementI4 ob1=new ImplementI4();
		ob1.sum();
		ob1.sum(10,20);
		ob1.sub();
		ob1.sub(20,10);
		ob1.mul();
		ob1.mul(10, 20);
	}

}
