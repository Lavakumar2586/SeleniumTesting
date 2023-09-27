package lava.ExcelOperations1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipledataEx2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream ExcelFile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(ExcelFile);
	XSSFSheet workSheet = workbook.getSheet("Sheet3");
	
	     int RowCount = workSheet.getLastRowNum();
	System.out.println("The number of rows in the sheet is :- "+RowCount);
	for (int rowIndex=0; rowIndex<RowCount; rowIndex++) {
	 Row rowdata =workSheet.getRow(rowIndex);
	  int rowCellCount = rowdata.getLastCellNum();
		System.out.println("The number of cells in the row is :_ "+rowCellCount);
	  
	  
	}
	
	
	
	}
}
