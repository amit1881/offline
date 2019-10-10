package com.offline;

abstract class AB{
	abstract void sum(int a,int b);
	void sub(int a,int b){
		System.out.println(a-b);
	}
}

public class TestAbstract extends AB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB ob=new TestAbstract();
		ob.sub(10, 5);
		ob.sum(10, 5);
	}

	@Override
	void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

}
