package lava.ExcelOperations2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipledata  {
	public static void main(String[] args) throws IOException {
		FileInputStream ExcelFile = new FileInputStream("./ExcelWorkBook/ExcelBasic1.xlsx");
		XSSFWorkbook ExcelBook = new XSSFWorkbook(ExcelFile);
		XSSFSheet ExcelSheet =ExcelBook.getSheet("Logintestdata");
// Identify the number of active rows in the sheet with the test data
	int	RowCount = ExcelSheet.getLastRowNum();
//goto every active row in the sheet
	for(int rowIndex=0; rowIndex<=RowCount; rowIndex++) {
		Row testdataRow = ExcelSheet.getRow(rowIndex);
		int  rowOfCellcount	= testdataRow.getLastCellNum();
		
		for(int cellIndex=0;cellIndex<rowOfCellcount; cellIndex++) {
	Cell	rowOfcell=	testdataRow.getCell(cellIndex);
 String	TestData  = rowOfcell.getStringCellValue();
 System.out.print(TestData +"   ");
		}
	System.out.println();
	}
		
		
	}
	}


