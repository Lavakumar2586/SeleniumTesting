package lava.WorldClock1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicWebtableDataHandling extends BaseTest {
	@Test(priority = 1 , description = "Capturing the webtable data dynamically")
	public void dynamicwebtabledatahandling() throws IOException {
		FileInputStream testdatafile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
		XSSFWorkbook testdataWorkbook = new XSSFWorkbook(testdatafile);
		XSSFSheet testdatasheet =testdataWorkbook.getSheet("Sheet1");
//  Identify the webtable
//   /html/body/div[5]/section[1]/div/section/div[1]
		By  WebtableProperty =	By.xpath("/html/body/div[5]/section[1]/div/section/div[1]");	
		 WebElement webtable = driver.findElement(WebtableProperty);

		 By	rowProperty = By.tagName("tr");
	List<WebElement> webtableRows=webtable.findElements(rowProperty);
// going to every of webtable
	for (int rowIndex=0 ; rowIndex<webtableRows.size();rowIndex++) {
	WebElement	WebtableRow = webtableRows.get(rowIndex);	
Row	newRow=testdatasheet.createRow(rowIndex);		//row is created
//find number of rowOfCells
    By  rowofcellproperty =	By.tagName("td");
//finding number of cells in the row
  List<WebElement>rowOfCells=  WebtableRow.findElements(rowofcellproperty);
//going to a row to all the cells
for(int rowofCellIndex=0;rowofCellIndex<rowOfCells.size(); rowofCellIndex++) {
	
Cell NewRowOfNewCell =	newRow.createCell(rowofCellIndex);		//create a rowOfcell
WebElement	rowOfcellData = rowOfCells.get(rowofCellIndex);
	   String rowOfCellDataText =	rowOfcellData.getText();
System.out.print(rowOfCellDataText+"   ");

NewRowOfNewCell.setCellValue(rowOfCellDataText);
	}  
FileOutputStream testdataoutputFile = new FileOutputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\Webtabledta.xlsx");
														// Webtabledta=> Creates new excelsheet
testdataWorkbook.write(testdataoutputFile);
System.out.println();

  }
		}
	}
