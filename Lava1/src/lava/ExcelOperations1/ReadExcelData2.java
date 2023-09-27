package lava.ExcelOperations1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData2 {

	public static void main(String[] args) throws IOException {
//Read data first time
/*	FileInputStream Excelfile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(Excelfile);
	XSSFSheet Sheet = workBook.getSheet("Sheet2");
	Row SheetRow = Sheet.getRow(1);
	Cell Rowcell = SheetRow.getCell(1);
	
	String testData = Rowcell.getStringCellValue();
	System.out.println(testData);		*/
// Read data SeecondTime
		
FileInputStream excelfile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");		
	XSSFWorkbook workbook = new XSSFWorkbook(excelfile);
	
	XSSFSheet excelSheet = workbook.getSheet("Sheet2");
	Row SheetRow = excelSheet.getRow(0);
	Cell celldata = SheetRow.getCell(1);
	
    String	testdata = celldata.getStringCellValue();
		System.out.println(testdata);
		
		
		
		
		
		
//Write data
	
	
	}

}
