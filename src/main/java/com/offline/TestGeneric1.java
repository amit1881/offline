package com.offline;

//Generic class
class TestGen<T>{
	//Generic method
	<T> void numericSum(T n1,T n2){
		System.out.println(n1+"+"+n2);
	}
}


public class TestGeneric1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGen<Integer> ob=new TestGen<Integer>();
		ob.numericSum(1, 2);
		TestGen<Float> ob1=new TestGen<Float>();
		ob1.numericSum(1.5, 2.5);
	}

}
