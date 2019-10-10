package com.jv;

import java.util.function.Function;

public class TestCurry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Currying
		 * Function Currying is a concept of breaking a function with many arguments into many functions with single argument 
		 * in such a way, that the output is same. 
		 * 
		 */
		
		Function<Integer, Function<Integer, Integer>> ob=u->v->u+v;
		int sum=ob.apply(2).apply(3);
		System.out.println(sum);
		ob=u->v->u*v;
		int prod=ob.apply(2).apply(3);
		System.out.println(prod);
	}

}
