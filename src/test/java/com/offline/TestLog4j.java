package com.offline;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;

public class TestLog4j {

	Logger log=Logger.getLogger(TestLog4j.class.getName());
	
	@BeforeMethod
	public void init(Method method){
		log.info("------------"+method.getName()+"-------------");
	}
	
	
}
