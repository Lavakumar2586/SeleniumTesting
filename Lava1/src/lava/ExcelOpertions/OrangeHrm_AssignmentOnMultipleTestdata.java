package lava.ExcelOpertions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm_AssignmentOnMultipleTestdata {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "F:\\Selenium Workspace\\Lava1\\BrowserDriverFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		driver.get(applicationUrlAddress);

		FileInputStream ExcelTestDataFile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
		XSSFWorkbook TestdataWorkBook = new XSSFWorkbook(ExcelTestDataFile);
		XSSFSheet TestDataSheet = TestdataWorkBook.getSheet("Logintestdata");
	    int  	SheetRowCount=	TestDataSheet.getLastRowNum();
      System.out.println(" The number of rows in the Sheet Contains data is :-  " +SheetRowCount);
	
      for(int rowIndex=1; rowIndex<=SheetRowCount; rowIndex++) {
      	Row rowdata = TestDataSheet.getRow(rowIndex);
      	int	CellCount = rowdata.getLastCellNum();
  	
      	for(int CellIndex=0; CellIndex<=CellCount;   CellIndex++ ) {
  			Cell UsernameCell = rowdata.getCell(CellIndex);
  			String  Usernamedata =  UsernameCell.getStringCellValue();
  			System.out.print(Usernamedata+ "     ");
  	    	Row sheetRow = TestDataSheet.getRow(0);
  			
  	    	String	UsernameProperty	= "txtUsername";
  			driver.findElement(By.id(UsernameProperty)).sendKeys(Usernamedata);

  			Cell PasswordCell = sheetRow.getCell(1);
  			String Passworddata  =	PasswordCell.getStringCellValue();
  			System.out.println(Passworddata);
  
  			String  PasswordProperty =	"txtPassword";
  			driver.findElement(By.name(PasswordProperty)).sendKeys(Passworddata);

  			
  			 String LoginButtonProperty ="Submit";
  			driver.findElement(By.name(LoginButtonProperty)).click();

  			
  								}
  	    System.out.println();
      														}
	
		
		
		
	}

}
