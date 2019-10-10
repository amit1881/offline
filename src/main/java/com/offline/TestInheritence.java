package com.offline;



class A{
	public void publicMethod(){
		System.out.println("in public method");
	}
	
//	public static void publicMethod(){
//		System.out.println("in public method");
//	}
	
	public int publicMethod(int i){//method overloading
		return 1;
	}
	
	final void defaultMethod(){
		System.out.println("in default method");
	}
	
	public void publicMethod(float j){
		System.out.println("");
	}
	
	protected void protectedMethod(){
		System.out.println("in protected method");
	}
	
	private void privateMethod(){
		System.out.println("in private method");
	}
	
	private int a=10,b=20,c=30;
	private int A,B,C;
	public int getA(){
		return a;
	}
	public int getB(){
		return b;
	}
	public int getC(){
		return c;
	}
	
}


class B extends A{
	public void publicMethod(){
		System.out.println("public method in child class");
	}
}
//MULTIPLE INHERITANCE IS NOT POSSIBLE WITH CLASS
//class C extends A,B{
//	
//}


public class TestInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B();
		A ob1=new A();
		ob1.publicMethod();
		ob.publicMethod();
		A ob2=new B();
		ob2.publicMethod();
		ob.protectedMethod();
		ob.defaultMethod();
		//ob.privateMethod(); // private member of parent class won't be accessible in child class
		System.out.println(ob.getA());
		int a= new A().getA();//accessing private members of a class in another class
		System.out.println(a);
		int b=new A().getB();
		System.out.println(b);
		int c=new A().getC();
		System.out.println(c);
		
	}

}
