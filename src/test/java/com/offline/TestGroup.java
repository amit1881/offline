package com.offline;

import org.testng.annotations.Test;

public class TestGroup {

	/*
	 * Dependent methods always execute after the execution of all independent methods.
	 */
	
	@Test(groups={"public"})
	public void test1(){
		System.err.println("in test 1");
	}
	
	@Test(groups={"public","g1"}) 
	public void test2(){
		System.out.println("in test 2");
	}
	
	@Test(groups="public")
	public void test3(){
		System.out.println("in test 3");
	}
	
	@Test(groups="private",dependsOnGroups="protected")
	private void test4(){
		System.out.println("in test 4");
	}
	
	@Test(groups="default", dependsOnMethods="test2") 
	void test5(){
	    System.out.println("in test 5");	
	}
	
	@Test(groups="protected")
	protected void test6(){
		System.out.println("in test 6");
	}
}
