package lava.ExcelOperations1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelDataEx2 {
public static void main(String[] args) throws IOException {
	
	FileInputStream ExcelFile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(ExcelFile);
		XSSFSheet WorkSheet = workbook.getSheet("Sheet3");
		
		Row Createrow = WorkSheet.createRow(5);
		Cell createcell = Createrow.createCell(4);
		createcell.setCellValue("This is selenium Practice");
		
		FileOutputStream savecelldata = new FileOutputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
		workbook.write(savecelldata);
		
	}
}
