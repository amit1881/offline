package com.offline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {
	String name;
	int age;
	int rollno;

	Students(String name, int age, int rollno) {
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}
}

class AgeComparator implements Comparator<Students> {

	@Override
	public int compare(Students st1, Students st2) {
		// TODO Auto-generated method stub
		if (st1.age == st2.age)
			return 0;
		else if(st1.age>st2.age)
			return 1;
		else
			return -1;
	}

}

class NameComparator implements Comparator<Students>{
	
	
	public int compare(Students s1, Students s2){
		return s1.name.compareTo(s2.name);
	}
	
}

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Students> stList=new ArrayList<Students>();
		stList.add(new Students("Vijay", 23, 101));
		stList.add(new Students("Ajay", 27, 106));
		stList.add(new Students("Jai", 21, 105));
		Collections.sort(stList,new AgeComparator());
		for(Students st:stList){
			System.out.println(st.name+" "+st.age+" "+st.rollno);
		}
		System.out.println();
		Collections.sort(stList, new NameComparator());
		for(Students st:stList){
			System.out.println(st.name+" "+st.age+" "+st.rollno);
		}
	}

}
