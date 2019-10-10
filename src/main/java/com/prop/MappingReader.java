package com.prop;

import java.util.Properties;

public class MappingReader {
	
	private static Properties testProperties;
	private static ResourceHelper helper;
	
	public static void main(String a[]){
		testProperties=new Properties();
		helper=new ResourceHelper();
		testProperties=helper.loadProperties(testProperties, "Mapping1.properties");
		System.out.println(testProperties.getProperty("United States of America"));
	}

}
