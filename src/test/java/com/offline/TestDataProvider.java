package com.offline;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestDataProvider extends TestLog4j{
	
	Logger log = Logger.getLogger(TestDataProvider.class);

	@DataProvider(name="employee")
	public Object[][] testDP() throws IOException{
		Object[][] emp=ExcelReader.readFromExcelWithoutIteartor("testdata/emp.xlsx", "employee");
		return emp;
	}
	
	@DataProvider(name="employee1")
	public Iterator<Object>[] testDP1() throws IOException{
		Iterator<Object>[] emp=ExcelReader.readFromExcelWithoutIteartor1("testdata/emp.xlsx", "employee");
		return emp;
	}
	
	@Test(dataProvider="employee")  
	public void getEmployeeData(String id, String name, String salary){
		log.info("--------------record for "+id+"----------------");
		System.out.println(id+"\t"+name+"\t"+salary);
	}
	
	@Test(dataProvider="employee", enabled=false)  
	public void getEmployeeData1(String name){
		//log.info("--------------record for "+id+"----------------");
		System.out.println(name);
	}
	
	@Test(enabled=false)
	public void test(){
		WebElement element=null;
		Select dd=new Select(element);
		
	}
	
}
