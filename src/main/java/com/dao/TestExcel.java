package com.dao;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;

class TestExcelOperation {
	private XSSFWorkbook workbook = null;
	private XSSFSheet worksheet = null;
	//private XSSFRow row = null;
	//private XSSFCell cell = null;

	public void iterateExcel() {
		try {
			//open a file
			File file = new File("testdata//emp.xlsx");
			//read a file
			FileInputStream fis=new FileInputStream(file);
			workbook=new XSSFWorkbook(fis);
			worksheet=workbook.getSheetAt(0);
			Iterator<Row> rowIterator=worksheet.rowIterator();
			while(rowIterator.hasNext()){
				//row=(XSSFRow) rowIterator.next();
				Row row=rowIterator.next();
				Iterator<Cell> cellIterator=row.cellIterator();
				while(cellIterator.hasNext()){
					Cell cell=cellIterator.next();
					switch(cell.getCellType()){
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue()+" \t\t ");
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue()+" \t\t ");
						break;
					}
				}
				System.out.println();
			}
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class TestExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestExcelOperation ob=new TestExcelOperation();
		ob.iterateExcel();
	}

}
