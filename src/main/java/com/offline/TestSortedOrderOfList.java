package com.offline;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestSortedOrderOfList {

	public static void main(String a[]){
		List<String> l1=new ArrayList<String>();
		
		l1.add("banglore");
		l1.add("delhi");
		l1.add("ghaziabad");
		l1.add("gurgaon");
		l1.add("noida");
		
		List<String> l2=new ArrayList<String>();
		l2.addAll(l1);
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println(l2);
		if(l2.equals(l1)){
			System.out.println("list is in ascending order");
		}
		else{
			System.out.println("list is not in ascending order");
		}
	}
	
}
