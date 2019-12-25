package com.factory;

import org.testng.annotations.Test;

public class Test3 {

	private String str;
	
	Test3(String str){
		this.str=str;
	}
	
	@Test
	public void test3(){
		System.out.println("Test3 test method::"+str);
	}
}
