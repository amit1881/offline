package com.offline;

class TestCallByValue{
	int a=10;
	public void testCallByValue(int a){
		a=a+10;
		System.out.println(a);
	}
	
}

class TestCallByReference{
	int a=10;
	public void testCallByReference(TestCallByReference ob){
		ob.a=ob.a+100;
		System.out.println(ob.a);
	}
}

public class TestCallByValueAndReferrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestCallByValue ob=new TestCallByValue();
		System.out.println(ob.a);
		ob.testCallByValue(5);
		System.out.println(ob.a);
		System.out.println();
		TestCallByReference ob1=new TestCallByReference();
		System.out.println(ob1.a);
		ob1.testCallByReference(ob1);
		System.out.println(ob1.a);
	}

}
