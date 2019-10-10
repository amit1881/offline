package com.offline;

import java.text.ParseException;
import java.text.SimpleDateFormat;

class Test1 {

	public static String foo(){
		System.out.println("Test foo called");
		return "";
	}
	
//	public static void main(String args[]){
//		Test obj = null;
//		System.out.println(obj.foo());
//	}
}



public class Test {

	public static String toString1(){
		System.out.println("Test toString called");
		return "";
	}
	
	public static void main(String args[]){
		System.out.println(toString1());
		Test1 obj=null;
		System.out.println(obj.foo());
		
		String n1="5,873,532";
		String n2="5873532.0";
		String n3="5873532.45";
		float n4=Float.parseFloat(n3);
		//int n5=Integer.parseInt(n3);
		
		System.out.println(Integer.parseInt("5873532"));
		System.out.println(Float.parseFloat(n1.replaceAll(",", "")));
		System.out.println(Float.parseFloat("5873532.0"));
		System.out.println(n4);
		//System.out.println(n5);
		if(Float.parseFloat(n1.replaceAll(",", ""))==Float.parseFloat("5873532.0")){
			System.out.println("matched");
		}
		
		
	}
	
	public static boolean isValidDate(String date) {
        //SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss:ms");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }
}

