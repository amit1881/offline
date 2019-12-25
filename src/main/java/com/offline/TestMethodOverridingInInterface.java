package com.offline;

interface IF1{
	void sum();
	//void display();
}

interface IF2{
	void sum();
	//int display();
}

public class TestMethodOverridingInInterface implements IF1,IF2{

	//method overriding is not possible in interface
//	public void sum(){
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IF1 ob1=new TestMethodOverridingInInterface();
		IF2 ob2=new TestMethodOverridingInInterface();
		ob1.sum();
		ob2.sum();
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("method overriding in interface");
	}

	//@Override
//	public int display() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	//@Override
//	public void display() {
//		// TODO Auto-generated method stub
//		//return 0;
//	}

//	@Override
//	public int display() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
