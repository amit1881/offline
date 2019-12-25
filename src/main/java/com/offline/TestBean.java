package com.offline;


class TestSetterGetter{
	private String name;
	private int age;
	private float salary;
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getAge(){
		return age; 
	}
	
	public void setSalary(float salary){
		this.salary=salary;
	}
	
	public float getSalary(){
		return salary;
	}
	
}

public class TestBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestSetterGetter ob=new TestSetterGetter();
		ob.setName("Mr Bean");
		ob.setAge(100);
		ob.setSalary(1);
		System.out.println("name::"+ob.getName());
		System.out.println("age::"+ob.getAge());
		System.out.println("salary::"+ob.getSalary());
	}

}
