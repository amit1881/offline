package com.offline;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	String name;
	int age;
	int rollno;

	Student(String name, int age, int rollno) {
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}

	public int compareTo(Student st) {
		// TODO Auto-generated method stub

		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}

// class CompareAge implements Comparable<Student>{
//
// @Override
// public int compareTo(Student st) {
// // TODO Auto-generated method stub
//
// if(st.age==st.age)
// return 0;
// else if(st.age>st.age)
// return 1;
// else
// return -1;
// }
//
// }

public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> stList = new ArrayList<Student>();
		stList.add(new Student("Vijay", 23, 101));
		stList.add(new Student("Ajay", 27, 106));
		stList.add(new Student("Jai", 21, 105));
		Collections.sort(stList);
		for (Student st : stList) {
			System.out.println(st.name + " " + st.age + " " + st.rollno);
		}
	}

}
