package lava.ExcelOperations2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteSingledata {

	 public static void main(String[] args) throws IOException {     
	FileInputStream ExcelFile = new FileInputStream("./ExcelWorkBook/ExcelBasic1.xlsx");
	XSSFWorkbook ExcelBook = new XSSFWorkbook(ExcelFile);
	XSSFSheet ExcelSheet =ExcelBook.getSheet("Sheet1");
//Read single data	
	Row sheetrow =ExcelSheet.getRow(0);
	Cell rowOfcell =sheetrow.getCell(0);
String	testdata = rowOfcell.getStringCellValue();
	System.out.println(testdata);
//Write single data
	Row newRow = ExcelSheet.createRow(6);
	Cell newCell =newRow.createCell(2);
	newCell.setCellValue("Testing Tools");
//to save the file
	FileOutputStream SaveExcelData = new FileOutputStream("./ExcelWorkBook/ExcelBasic1.xlsx");
	ExcelBook.write(SaveExcelData);

	
	 }
}
