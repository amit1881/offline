package com.dao;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTAutoFilter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
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

void setAutoFilter(final XSSFSheet sheet, final int column, final String value) {
    sheet.setAutoFilter(CellRangeAddress.valueOf("A1:B1"));

    final CTAutoFilter sheetFilter = sheet.getCTWorksheet().getAutoFilter();
    //final CTFilterColumn filterColumn = sheetFilter.addNewFilterColumn();
    //filterColumn.setColId(column);
    //final CTFilter filter = filterColumn.addNewFilters().insertNewFilter(0);
    //filter.setVal(value);

    // We have to apply the filter ourselves by hiding the rows: 
    for (final Row row : sheet) {
        for (final Cell c : row) {
            if (c.getColumnIndex() == column && !c.getStringCellValue().equals(value)) {
                final XSSFRow r1 = (XSSFRow) c.getRow();
                if (r1.getRowNum() != 0) { // skip header
                    r1.getCTRow().setHidden(true);
                }
            }
        }
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
