package com.offline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if (age == st.age) {
			return 0;
		} else if (age > st.age) {
			return 1;
		} else
			return -1;
	}

}

public class TestComparable {

	public static void main(String str[]){
		List<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"java",28));
		al.add(new Student(102,"c",22));
		al.add(new Student(103,"groovy",25));
		Collections.sort(al);
		for(Student s: al){
			System.out.println(s.rollno+"\t"+s.name+"\t"+s.age);
		}
	}
	
	
}
