package com.offline;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMethods {

	@Parameters({"a","b"})
	@Test
	public void testMethodWithoutReturn(String a, String b){
		System.out.println("test method without return");
		System.out.println(a+b);
	}
	
	@Test
	public int testMethodWithReturn(){
		System.out.println("test method with return");
		return 1;
	}
	
}
