package lava.ExcelOpertions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSingleData {

	public static void main(String[] args) throws IOException {
		FileInputStream  ExcelTestDataFile =new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");

		XSSFWorkbook ExcelworkBook = new XSSFWorkbook(ExcelTestDataFile); 
		
		XSSFSheet  workbooksheet = ExcelworkBook.getSheet("Sheet1");

//creating a particular row in the sheet
		Row sheetofnewRow = workbooksheet.createRow(13);
// creating a particular Row Of a cell
	   Cell newRowOfCell =	sheetofnewRow.createCell(5);
	   newRowOfCell.setCellValue("Livetech");
	   FileOutputStream  saveExceltestDataFile = new FileOutputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
	   	ExcelworkBook.write(saveExceltestDataFile);
	}

}
