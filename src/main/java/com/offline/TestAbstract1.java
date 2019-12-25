package com.offline;

interface InA{
	
	void a();
	void b();
	void c();
	void d();
}

abstract class ac implements InA{
	public void a(){
		System.out.println("in a");
	}
}

public class TestAbstract1 extends ac{

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("in b");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("in c");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("in d");
	}
	
	public static void main(String a[]){
		InA ob=new TestAbstract1();
		ob.a();
		ob.b();
		ob.c();
		ob.d();
	}

}
