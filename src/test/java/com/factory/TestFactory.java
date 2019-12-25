package com.factory;

import org.testng.annotations.Factory;
import org.testng.annotations.DataProvider;

public class TestFactory {
	
	
//	@Factory(dataProvider="dp")
//	public Object[] testFactory(String str){
//		Object[] tests=new Object[1];
//		tests[0]=new Test3(str);
//		return tests;
//	}
	
	@Factory
	public Object[] testFactory(){
		Object[] tests=new Object[2];
		tests[0]=new Test1();
		tests[1]=new Test2();
		return tests;
	}
	
	@DataProvider
	public Object[][] dp(){
		return new Object[][]{new Object[]{"param1"},new Object[]{"param2"}};
	}
	
}
