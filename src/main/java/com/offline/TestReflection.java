package com.offline;

import java.lang.reflect.Field;
/*
 * Access private member of a class in another class using Reflection
 */
class PrivateObject {

	  private String privateString = null;

	  public PrivateObject(String privateString) {
	    this.privateString = privateString;
	  }
	  
	  private int a = 10;
	  private int b = 20;
	}

public class TestReflection {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		PrivateObject ob = new PrivateObject("hello");
		Field f1 = PrivateObject.class.getDeclaredField("privateString");
		Field f2 = PrivateObject.class.getDeclaredField("a");
		Field f3 = PrivateObject.class.getDeclaredField("b");
		f1.setAccessible(true);
		f2.setAccessible(true);
		f3.setAccessible(true);
		String v1=f1.get(ob).toString();
		String v2=f2.get(ob).toString();
		String v3=f3.get(ob).toString();
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}

}
