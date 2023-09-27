package lava.ExcelOperations1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipledata {

	public static void main(String[] args) throws IOException {
		FileInputStream ExcelFile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelSheetForRevision.xlsx");
	    XSSFWorkbook workbook = new XSSFWorkbook(ExcelFile);
	    XSSFSheet worksheet =workbook.getSheet("Sheet1");

	    int sheetRowCount = worksheet.getLastRowNum();
	    System.out.println("the number of rows in the sheet is :- "+ sheetRowCount);

	 // for getting multiple data we will use NestedLoops
	    
	    for (int rowIndex = 0; rowIndex<=sheetRowCount; rowIndex++) {
	    Row Rowtestdata	= worksheet.getRow(rowIndex);
	    	int RowcellCount =  Rowtestdata.getLastCellNum();
	    	for(int cellIndex=0; cellIndex<RowcellCount; cellIndex++ ) {
	    		Cell celldata =Rowtestdata.getCell(cellIndex);
	   String testdata	=	celldata.getStringCellValue();
	   System.out.print(testdata + "   ");
	   	   	    	}
	    	System.out.println();
	    }
	     
	}
}
