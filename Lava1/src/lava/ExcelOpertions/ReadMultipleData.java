package lava.ExcelOpertions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleData {

	public static void main(String[] args) throws IOException  {
	
FileInputStream ExcelFile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
	XSSFWorkbook excelWorkbook = new  XSSFWorkbook(ExcelFile);
		
		XSSFSheet WorkBookSheet =excelWorkbook.getSheet("Sheet3");

      int  	SheetRowCount=	WorkBookSheet.getLastRowNum();
	
      System.out.println(" The number of rows in the Sheet3 Contains data is :-  " +SheetRowCount);

// By using Loops we will get multiple data	

    for(int rowIndex=0; rowIndex<=SheetRowCount; rowIndex++) {
    	Row TestDataSheet_Row = WorkBookSheet.getRow(rowIndex);
    	int	RowOfCell_Count = TestDataSheet_Row.getLastCellNum();
	
    	for(int testDataSheet_RowOfCellIndex=0; testDataSheet_RowOfCellIndex<RowOfCell_Count; testDataSheet_RowOfCellIndex++ ) {
			Cell RowOfCell = TestDataSheet_Row.getCell(testDataSheet_RowOfCellIndex);
		
			String  TestData =  RowOfCell.getStringCellValue();
	
			System.out.println(TestData+ "     ");
								}
	    System.out.println();
    															}
	
	}

}
