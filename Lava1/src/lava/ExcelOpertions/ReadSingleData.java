package lava.ExcelOpertions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSingleData {

	public static void main(String[] args) throws IOException {

		FileInputStream  ExcelTestDataFile =new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");

	XSSFWorkbook ExcelworkBook = new XSSFWorkbook(ExcelTestDataFile); 
	
	XSSFSheet  workbooksheet = ExcelworkBook.getSheet("Sheet1");
	
	Row sheetRow = workbooksheet.getRow(0);
	
	Cell RowOfCell = sheetRow.getCell(0);
	
	
	String Testdata  =	RowOfCell.getStringCellValue();
	System.out.println(Testdata);
		
		
		
	}

}
