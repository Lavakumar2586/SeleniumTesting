package lava.ExcelOperations1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestOrangeHrmWirhMultipledata {
public static void main(String[] args) throws IOException {
	FileInputStream ExcelFile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
		XSSFWorkbook Workbook = new XSSFWorkbook(ExcelFile);
		XSSFSheet WorkSheet = Workbook.getSheet("Sheet3");
		Row Rowdata = WorkSheet.getRow(1);
//Read Testdata
		Cell Celldata = Rowdata.getCell(0);
		String testdata	=	Celldata.getStringCellValue();
		System.out.println(testdata);
		
//Write testdata
		Cell Celldata1 =Rowdata.createCell(4);
	Celldata1.setCellValue("Lava learn testing");
		
		
		
}
	
	
	
}
