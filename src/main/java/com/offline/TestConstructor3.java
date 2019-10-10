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
}

class c3 extends c2{
	c3(){
		System.out.print("c");
	}
}


public class TestConstructor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c3 ob=new c3();

	}

}
