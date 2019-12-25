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
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ExcelReader extends TestLog4j{
	
	Logger log = Logger.getLogger(ExcelReader.class);

	private static File file, f1, f2=null;
	private static FileInputStream fis, fis1, fis2=null;
	
	private static XSSFWorkbook workbook,workbook1, workbook2=null;
	private static XSSFSheet worksheet, worksheet1, worksheet2=null;
	
//	public static void main(String a[]) throws IOException{
//		//readFromExcel("testdata/emp.xlsx", "employee");
//		readFromExcelWithoutIteartor("testdata/emp.xlsx", "employee");
//	}
	
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

    @Test
    public void compareExcel() throws IOException{
    	f1=new File("testdata/emp1.xlsx");
        fis1=new FileInputStream(f1);
        workbook1=new XSSFWorkbook(fis1);
        worksheet1=workbook1.getSheetAt(0);
        int rowCount=worksheet1.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		int cellCount=worksheet1.getRow(0).getLastCellNum();
		System.out.println(cellCount);
		f2=new File("testdata/emp2.xlsx");
        fis2=new FileInputStream(f2);
        workbook2=new XSSFWorkbook(fis2);
        worksheet2=workbook2.getSheetAt(0);
        assertEquals(rowCount,worksheet2.getPhysicalNumberOfRows());
        assertEquals(cellCount,worksheet2.getRow(0).getLastCellNum());        
        XSSFRow row1, row2=null;
		XSSFCell cell1, cell2=null;
		for(int i=0;i<rowCount;i++){
			row1=worksheet1.getRow(i);
			row2=worksheet2.getRow(i);
			for(int j=0;j<cellCount;j++){
				cell1=row1.getCell(j);
				cell2=row2.getCell(j);
				log.info("--------------Comparing::"+new DataFormatter().formatCellValue(cell1)+"----------------"+new DataFormatter().formatCellValue(cell2));
				assertEquals(new DataFormatter().formatCellValue(cell1),new DataFormatter().formatCellValue(cell2));
			}
		}
    }

}
