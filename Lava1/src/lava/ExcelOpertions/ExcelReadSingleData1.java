package lava.ExcelOpertions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadSingleData1 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream ExcelDataFile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
		    XSSFWorkbook WorkBook = new XSSFWorkbook(ExcelDataFile);
		    XSSFSheet TestDataSheet = WorkBook.getSheet("Sheet1");
   // for read single data  
		    Row RowData = TestDataSheet.getRow(1);
		    Cell  CellData = RowData.getCell(0);
		    String Testdata = CellData.getStringCellValue();
		System.out.println(Testdata);

//for 	Write single data
		
		Row NewRowData = TestDataSheet.createRow(7);
		Cell NewCellData = NewRowData.createCell(6);
		NewCellData.setCellValue("Software");
		
//Saving Excelfile along with workbook
		FileOutputStream SaveNewData = new FileOutputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
		WorkBook.write(SaveNewData);
	    Row RowData1 = TestDataSheet.getRow(7);
	    Cell  CellData1 = RowData1.getCell(6);
	    String Testdata1 = CellData1.getStringCellValue();
	System.out.println(Testdata1);

		
	}

}
