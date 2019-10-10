package com.offline;

//Generic class
class TestGenericClass<T>{
	
	T obj;
	TestGenericClass(T obj){
		this.obj=obj;
	}
	
	public TestGenericClass() {
		// TODO Auto-generated constructor stub
	}

	//Generic method
	<T>T testGenericMethod(T obj){
		System.out.println(obj.toString());
		return obj;
		
	}
	
	<T>void testGenericMethod(T name,T rollno){
		System.out.println(name+"="+rollno);
	}
	
	T getObject(){
		return obj;
	}
	
}

class Employee{
	private String name;
	private String address;
	
	Employee(String name,String address){
		this.name=name;
		this.address=address;
	}
	
//	public void setName(String name){
//		this.name=name;
//	}
	
	public String getName(){
		return name;
	}
	
//	public void setAddress(String address){
//		this.address=address;
//	}
	
	public String getAddress(){
		return address;
	}
}


public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer int1=new Integer(10);
		TestGenericClass<Integer> obj=new TestGenericClass<Integer>(int1);
		System.out.println(obj.getObject());
		System.out.println(obj.testGenericMethod(int1));
		TestGenericClass<String> obj2=new TestGenericClass<String>();
		obj2.testGenericMethod("java", "1.8");
		Employee emp=new Employee("Jack","Gurgaon");
		TestGenericClass<Employee> obj1=new TestGenericClass<Employee>(emp); 
		System.out.println(obj1.getObject().getName()+" "+obj1.getObject().getAddress());
		System.out.println(obj1.getObject());
		
		System.out.println(obj1.testGenericMethod(emp));
	}

}
