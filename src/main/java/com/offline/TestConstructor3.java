package com.offline;

class c1{
	c1(){
		System.out.print("a");
	}
}

class c2 extends c1{
	c2(){
		System.out.print("b");
	}
	
	c2(String str){
		System.out.print("bb");
	}
	
}

class c3 extends c2{
	c3(String string){
		System.out.print("d");
	}

	public c3() {
		// TODO Auto-generated constructor stub
		System.out.print("c");
	}

	public c3(String string, String string2) {
		// TODO Auto-generated constructor stub
		System.out.print("e");
	}
}


public class TestConstructor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c3 ob=new c3();
		System.out.println();
		c3 ob1=new c3("hello");
		System.out.println();
		c3 ob2=new c3("hello","hi");

	}

}
