package com.offline;

import org.testng.annotations.Test;

public class TestGrp {

	@Test(groups = "g1")
	public void TestMethod1() {
		System.out.println("TestGrp.TestMethod1()");
	}

	@Test(groups = { "g2" })
	public void TestMethod2() {
		System.out.println("TestGrp.TestMethod2()");
	}

	@Test(groups = { "g1", "g2" })
	public void TestMethod3() {
		System.out.println("TestGrp.TestMethod3()");
	}

}
