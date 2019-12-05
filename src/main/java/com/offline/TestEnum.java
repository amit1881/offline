package com.offline;

public class TestEnum {

	enum te{
	
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY
	}
	
	public static void main(String ar[]){
		
		System.out.println(te.values());
		
		for(te str: te.values()){
			System.out.println(str);
			
		}
		
		System.out.println(TestEnum1.MONDAY.isWeekDay());
		System.out.println(TestEnum1.SUNDAY.isWeekDay());
		
	}
	
}

enum TestEnum1 {
	
	SUNDAY(0),
	MONDAY(1),
	TUESDAY(2),
	SATURDAY(3);
	int num;
	TestEnum1(int num){
		this.num=num;
	}
	
	public boolean isWeekDay(){
		return this!=SUNDAY&&this!=SATURDAY;
	}
	
//	public static void main(String a[]){
//		System.out.println(TestEnum1.MONDAY.isWeekDay());
//		System.out.println(TestEnum1.SUNDAY.isWeekDay());
//	}
	
}
