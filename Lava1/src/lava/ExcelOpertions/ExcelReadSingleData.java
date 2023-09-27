package lava.ExcelOpertions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadSingleData {

	public static void main(String[] args) throws IOException {
//Identify the Excel File in the System
FileInputStream ExcelTestDataFile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");

//Identify the workbook in the Excel File
XSSFWorkbook excelWorkBook = new XSSFWorkbook(ExcelTestDataFile);

//Identify the perticular sheet in the workbook
XSSFSheet WorkBookSheet = excelWorkBook.getSheet("Sheet2");

//Identify the row of the sheet
Row sheetRow = WorkBookSheet.getRow(1);

//Identify the Row of a cell in the sheet
Cell RowOfCell = sheetRow.getCell(1);

//get the testData from the row of cell 
  	String TestData = RowOfCell.getStringCellValue();
	
	System.out.println(TestData);	
	}

}
