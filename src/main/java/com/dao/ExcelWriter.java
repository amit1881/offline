package com.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSS

import com.aventstack.extentreports.Status;
//import com.testshred.aus.ah.DataValidation;
//import com.testshred.us_property.DataValidation;

public class ExcelWriter {

	static XSSFWorkbook workbook;
	static XSSFSheet spreadsheet;
	static XSSFRow row;
	static XSSFCell cell;
	static FileOutputStream out;
	static File file;
	static FileInputStream fis;

	//String filePath = "src/test/resources/output/report" + DataValidation.Unique + ".xlsx";

	public void writeToExcel(String ui_element, String ui_value, String db_value, Status st, int rownum,
			String ui, String filePath) {
		try {
			
			file = new File(filePath);
			if (file.exists()) {
				fis = new FileInputStream(file);
				workbook = new XSSFWorkbook(fis);
			}
			 else{
			 workbook = new XSSFWorkbook();
			 }

			if (rownum == 1) {

				spreadsheet = workbook.createSheet(ui);
				System.out.println(spreadsheet.toString());
				row=spreadsheet.createRow(0);
				row.createCell(0).setCellValue("UI Element");
				row.createCell(1).setCellValue("UI Value");;
				row.createCell(2).setCellValue("DB Value");
				row.createCell(3).setCellValue("Status");
			}
			
			spreadsheet = workbook.getSheet(ui);
			row = spreadsheet.createRow(rownum);
			row.createCell(0).setCellValue(ui_element);
			row.createCell(1).setCellValue(ui_value);
			row.createCell(2).setCellValue(db_value);
			row.createCell(3).setCellValue(st.toString());
			
			out = new FileOutputStream(filePath);
			workbook.write(out);
			out.close();
			System.out.println("output written successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeToExcel(String ui_element, String ui_value, String db_value, String st, int rownum,
			String ui, String filePath) {
		try {
			
			file = new File(filePath);
			if (file.exists()) {
				fis = new FileInputStream(file);
				workbook = new XSSFWorkbook(fis);
			}
			 else{
			 workbook = new XSSFWorkbook();
			 }

			if (rownum == 1) {

				spreadsheet = workbook.createSheet(ui);
				System.out.println(spreadsheet.toString());
				row = spreadsheet.createRow(0);
				cell = row.createCell(0);
				cell.setCellValue("UI Element");
				cell = row.createCell(1);
				cell.setCellValue("UI Value");
				cell = row.createCell(2);
				cell.setCellValue("DB Value");
				cell = row.createCell(3);
				cell.setCellValue("Status");

			}
			
			spreadsheet = workbook.getSheet(ui);
			row = spreadsheet.createRow(rownum);
			cell = row.createCell(0);
			cell.setCellValue(ui_element);
			cell = row.createCell(1);
			cell.setCellValue(ui_value);
			cell = row.createCell(2);
			cell.setCellValue(db_value);
			cell = row.createCell(3);
			cell.setCellValue(st.toString());

			out = new FileOutputStream(filePath);
			workbook.write(out);
			out.close();
			System.out.println("output written successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeToExcel(String ui_element, float ui_value, float db_value, String st, int rownum,
			String ui, String filePath) {
		try {
			
			file = new File(filePath);
			if (file.exists()) {
				fis = new FileInputStream(file);
				workbook = new XSSFWorkbook(fis);
			}
			 else{
			 workbook = new XSSFWorkbook();
			 }

			if (rownum == 1) {

				spreadsheet = workbook.createSheet(ui);
				System.out.println(spreadsheet.toString());
				row = spreadsheet.createRow(0);
				cell = row.createCell(0);
				cell.setCellValue("UI Element");
				cell = row.createCell(1);
				cell.setCellValue("UI Value");
				cell = row.createCell(2);
				cell.setCellValue("DB Value");
				cell = row.createCell(3);
				cell.setCellValue("Status");

			}
			
			spreadsheet = workbook.getSheet(ui);
			row = spreadsheet.createRow(rownum);
			cell = row.createCell(0);
			cell.setCellValue(ui_element);
			cell = row.createCell(1);
			cell.setCellValue(ui_value);
			cell = row.createCell(2);
			cell.setCellValue(db_value);
			cell = row.createCell(3);
			cell.setCellValue(st.toString());

			out = new FileOutputStream(filePath);
			workbook.write(out);
			out.close();
			System.out.println("output written successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public static void writeToExcel(String filePath, String fileName,String sheetName, LinkedHashMap<Cell, Cell> edw, LinkedHashMap<Cell, Cell> edw1) {
		try{
			XSSFWorkbook report = new XSSFWorkbook();
		XSSFSheet ui = report.createSheet("Comparison Result");
		int i=0;
		Row head = ui.createRow(i);
		head.createCell(0).setCellValue("Fields");
		head.createCell(1).setCellValue("EDW");
		head.createCell(2).setCellValue("Shredd");
		head.createCell(3).setCellValue("Result");
		for(Map.Entry<Cell, Cell> m:edw.entrySet())
        {	i++;
			Row row = ui.createRow(i);
			Cell key = m.getKey();
			row.createCell(0).setCellValue(key.toString());
			row.createCell(1).setCellValue(m.getValue().toString());
			row.createCell(2).setCellValue(edw1.get(key).toString());
       	if(m.getValue()==edw1.get(key)) {
       		row.createCell(3).setCellValue("Pass");
       	}
       	else {
       		row.createCell(3).setCellValue("Fail");
       	}
       	
        }
		 FileOutputStream out = new FileOutputStream(new File(filePath+"\\"+fileName)); 
	     report.write(out); 
	     report.close();}
	catch(Exception e) {
	    	 
	     }
	     
	     
		
	}

	static String createRandomNumber() {
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyhhmmss");
		Date date = new Date();
		String currenttimedate = dateFormat.format(date);
		return currenttimedate;
	}

}
