package com.offline;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class TestThrows {
	private String name;
	//THROWS CLAUSE DEMO
	public void test() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name::");
		name = br.readLine();
	}

	public void disp() {
		System.out.println("Your name is::" + name);
	}
}

class TestThrow {
	private String str = "throw clause";
	//THROW CLAUSE DEMO
	public void testThrow() {
		try {
			int i = 10 / 0;
			int []a={1,2,3};
			a[100]=100;
			throw new ArithmeticException("can't devide a number by zero");
			//throw new ArrayIndexOutOfBoundsException("can't store a value beyond the array index number"); //unreachable code

		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
//USER DEFINED EXCEPTIONS DEMO
class MyException extends Exception{
	
	private int a=10;
	private int b=20;
	MyException(String str){
		//super(str);
		System.out.println(str);
	}
	
	public void throwUserDefinedException(MyException ob){
		if(a<b){
			try{
			//throw new MyException("throw a user defined exception");
				throw ob;
			}
			catch(MyException me){//if we dont' call super class constructor, it shows null in message
				System.out.println(me.getMessage());
			}
		}
	}
	
	
}


class NewException extends Exception{
	NewException(String str){
		super(str);
	}
	void testNewException(){
		int[] arr={1,2,3,4,5};
		for(int a: arr){
			System.out.println(a);
			if(a>4){
				try {
					throw new NewException("new user defined exception");
				} catch (NewException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
		}	
	}
	
	
}

public class TestExceptions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		NewException ne=new NewException("new exception");
		ne.testNewException();
		
		TestThrows ob = new TestThrows();
		ob.test();
		ob.disp();
		
		TestThrow ob1=new TestThrow();
		ob1.testThrow();

		System.out.println();
		
		MyException ob2=new MyException("throw a user defined exception");
		ob2.throwUserDefinedException(ob2);
		
		try {// nested try catch
			try {
				int a = 10 / 0;
			} catch (Exception e) {
				System.out.println(e);
			}
			int[] arr = { 1, 2, 3 };
			arr[100] = 100;
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception::" + e.getMessage());

		}

		finally {
			System.out.println("finally block");
		}

	}

}
