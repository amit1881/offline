package com.offline;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ExcelReader {

	private static File file=null;
	private static FileInputStream fis=null;
	
	private static XSSFWorkbook workbook=null;
	private static XSSFSheet worksheet=null;
	
	public static void main(String a[]) throws IOException{
		//readFromExcel("testdata/emp.xlsx", "employee");
		readFromExcelWithoutIteartor("testdata/emp.xlsx", "employee");
	}
	
	public static Object[][] readFromExcel(String filePath, String sheetName) throws IOException{
		
		Object employeeData[][]=null;
		int i=0;
		
		file=new File(filePath);
		fis=new FileInputStream(file);
		workbook=new XSSFWorkbook(fis);
		worksheet=workbook.getSheet(sheetName);
		int rowCount=worksheet.getLastRowNum();
		int cellCount=worksheet.getRow(0).getLastCellNum();
		employeeData=new Object[rowCount][cellCount];
		Iterator<Row> rowIterator=worksheet.rowIterator();
		while(rowIterator.hasNext()){
			if(i==0)
        	{
        		Row row = rowIterator.next();
        	}
			int j=0;
			Row row=rowIterator.next();
			Iterator<Cell> cellIterator=row.cellIterator();
			while(cellIterator.hasNext()){
				Cell cell=cellIterator.next();
				switch(cell.getCellType()){
				case Cell.CELL_TYPE_STRING:
					employeeData[i][j++]=cell.getStringCellValue();
					//System.out.println(employeeData);
					break;
				case Cell.CELL_TYPE_NUMERIC:
					employeeData[i][j++]=cell.getNumericCellValue();
					//System.out.println(employeeData);
					break;
				}
			}
			i++;
//			if(i==rowCount){
//				break;
//			}
		}
		
		return employeeData;
		
	}

	public static Object[][] readFromExcelWithoutIteartor(String filePath, String sheetName) throws IOException{
		
		List<String> listOfNames=new ArrayList<String>();
		Map<String, List<String>> m1=new HashMap<String, List<String>>();
		file=new File(filePath);
		fis=new FileInputStream(file);
		workbook=new XSSFWorkbook(fis);
		worksheet=workbook.getSheet(sheetName);
		int rowCount=worksheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		System.out.println(worksheet.getLastRowNum());
		int cellCount=worksheet.getRow(0).getLastCellNum();
		System.out.println(cellCount);
		Object[][] employeeData=new Object[rowCount-1][cellCount];
		
		XSSFRow row=null;
		XSSFCell cell=null;
		for(int i=1;i<rowCount;i++){
			row=worksheet.getRow(i);
			for(int j=0;j<cellCount;j++){
				cell=row.getCell(j);
				employeeData[i-1][j]=new DataFormatter().formatCellValue(cell);
				//System.out.println(employeeData[i-1][j]);
				if(j==1){
				listOfNames.add(new DataFormatter().formatCellValue(cell));	
				}
			}
		}
		
		m1.put("employee name", listOfNames);
		for(Entry<String, List<String>> en: m1.entrySet()){
			System.out.println(en.getKey()+" =\t"+en.getValue());
		}
		return employeeData;
	}
	
public static Iterator<Object>[] readFromExcelWithoutIteartor1(String filePath, String sheetName) throws IOException{
		
		List<Object> listOfNames=new ArrayList<Object>();
		Map<Object, List<Object>> m1=new HashMap<Object, List<Object>>();
		file=new File(filePath);
		fis=new FileInputStream(file);
		workbook=new XSSFWorkbook(fis);
		worksheet=workbook.getSheet(sheetName);
		int rowCount=worksheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		int cellCount=worksheet.getRow(0).getLastCellNum();
		System.out.println(cellCount);
		Object[][] employeeData=new Object[rowCount-1][cellCount];
		
		XSSFRow row=null;
		XSSFCell cell=null;
		for(int i=1;i<rowCount;i++){
			row=worksheet.getRow(i);
			for(int j=0;j<cellCount;j++){
				cell=row.getCell(j);
				employeeData[i-1][j]=new DataFormatter().formatCellValue(cell);
				//System.out.println(employeeData[i-1][j]);
				if(j==1){
				listOfNames.add(new DataFormatter().formatCellValue(cell));	
				}
			}
		}
		
		m1.put("employee name", listOfNames);
		for(Entry<Object, List<Object>> en: m1.entrySet()){
			System.out.println(en.getKey()+" =\t"+en.getValue());
		}
		Iterator<Object>[] it=(Iterator<Object>[]) m1.get("employee name").toArray();
		return it;
	}
}
