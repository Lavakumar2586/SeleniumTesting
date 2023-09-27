package lava.ExcelOperations1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExceldata {

	public static void main(String[] args) throws IOException {
FileInputStream ExcelFile =new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
	XSSFWorkbook Workbook = new  XSSFWorkbook(ExcelFile);
	XSSFSheet WorkSheet = Workbook.getSheet("Sheet3");
	
				Row createrow = WorkSheet.createRow(3);
	Cell createCell = createrow.createCell(4);
		createCell.setCellValue("Lava kumar is a good boy");
	
		FileOutputStream SaveExcelDatafile = new FileOutputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
		Workbook.write(SaveExcelDatafile);
		
	}

}
