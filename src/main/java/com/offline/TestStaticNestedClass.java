package com.offline;


class TestSub extends TestStaticNestedClass{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A ob=new A();
			ob.testA();
			TestStaticNestedClass ob1=new TestStaticNestedClass();
			TestStaticNestedClass.B ob2=ob1.new B();
			ob2.testB();
			//private member of parent class won't be accessible in child class
//			TestStaticNestedClass.C ob3=ob1.new C();
//			ob3.testC();
	}
}


public class TestStaticNestedClass {
	
	static int a=10;
	int b=20;
	private static int c=100;
	//static nested class
	static class A{
		
		public void testA(){
			System.out.println("inside A");
			System.out.println(a);
			System.out.println(c);
		}
		
	}
	//non-static nested classes are also known as inner classes
	class B{
		public void testB(){
			System.out.println("inside B");
			System.out.println(b);
			System.out.println(c);
		}
	}
	
	private class C{
		public void testC(){
			System.out.println("inside C");
			System.out.println(b);
			System.out.println(c);
		}
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			A ob=new A();
//			ob.testA();
//			TestStaticNestedClass ob1=new TestStaticNestedClass();
//			TestStaticNestedClass.B ob2=ob1.new B();
//			ob2.testB();
//			
//			TestStaticNestedClass.C ob3=ob1.new C();
//			ob3.testC();
//	}

}
