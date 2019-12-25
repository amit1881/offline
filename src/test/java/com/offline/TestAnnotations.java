package com.offline;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	
	@BeforeSuite
	public void testBeforeSuite(){
		System.out.println("in before suite");
	}
	
	@BeforeTest
	public void testBeforeTest(){
		System.out.println("in before test");
	}
	
	@BeforeClass
	public void testBeforeClass(){
		System.out.println("in before class");
	}
	
	//@BeforeMethod
	public void testBeforeMethod(){
		System.out.println("in before method");
	}
	
	@Test(threadPoolSize=5, invocationCount=10)
	public void testTestMethod(){
		System.out.println("in test method");
	}
	
	//@Test
	public void testTestMethod1(){
		System.out.println("in test method1");
	}

}
