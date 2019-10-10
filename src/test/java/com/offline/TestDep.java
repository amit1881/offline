package com.offline;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import static org.testng.Assert.assertEquals;
import org.testng.Reporter;
import org.apache.log4j.Logger;

@Listeners(TestNewListener.class)
public class TestDep extends TestLog4j{
	
	//Logger logger=Logger.getLogger(TestDep.class.getName());

	@Test(groups = { "gr1" })
	public void testMethod1() {
		System.out.println("TestDep.testMethod1()");
		Reporter.log("test method1 started");
		//logger.info("method1 started");
	}

	@Test(dependsOnGroups = "gr1")
	public void testMethod2() {
		System.out.println("TestDep.testMethod2()");
		//logger.info("method2 started");
	}

	@Test(groups = "gr1")
	public void testMethod3() {
		System.out.println("TestDep.testMethod3()");
		//logger.info("method3 started");
	}

	@Test(dependsOnMethods = "testMethod2")
	public void testMethod4() {
		System.out.println("TestDep.testMethod4()");
		//logger.info("method4 started");
		assertEquals("test","test4");
	}

}
