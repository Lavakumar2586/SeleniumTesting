package lava.ExcelOperations1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSingleData {
public static void main(String[] args) throws IOException {
	
	FileInputStream ExcelFile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
		XSSFWorkbook ExcelWorkBook = new XSSFWorkbook(ExcelFile);
		XSSFSheet Excelsheet =ExcelWorkBook.getSheet("Sheet2");
//first read data		
		Row SheetRow = Excelsheet.getRow(0);
		Cell CellValue = SheetRow.getCell(0);
	String	testdata = CellValue.getStringCellValue();
		
		System.out.println(testdata);  
		
//second read data
		Row SheetRow1 = Excelsheet.getRow(0);
		Cell CellValue1 = SheetRow1.getCell(1);
	String	testdata1 = CellValue1.getStringCellValue();
		System.out.println("****************");
		System.out.println(testdata); 
		
			System.out.println(testdata1);
//first time Create Cell in a particular row
		Row createNewRow = Excelsheet.createRow(5);
		Cell createNewcell = createNewRow.createCell(4);
		createNewcell.setCellValue("LavaKumar is a  Big -------> ??");
	
//Secondtime Create Cell
		Row createNewRow1 = Excelsheet.createRow(6);
		Cell createNewcell1 = createNewRow1.createCell(5);
		createNewcell.setCellValue("LavaKumar is a Complain boy");
	
		
//Saving Excel File 
		FileOutputStream SaveExcelDataFile = new FileOutputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
		ExcelWorkBook.write(SaveExcelDataFile);
}
}
