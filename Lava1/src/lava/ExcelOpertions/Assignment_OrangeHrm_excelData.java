package lava.ExcelOpertions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_OrangeHrm_excelData {

	public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.chrome.driver", "F:\\Selenium Workspace\\Lava1\\BrowserDriverFiles\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
	String	OrangeHrm="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
			driver.get(OrangeHrm);
			driver.manage().window().maximize();
//Apply ImplicitlyWait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		FileInputStream  OrangeHRM_ExcelTestDataFile =new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");

		XSSFWorkbook OrangeHRMExcelData = new XSSFWorkbook(OrangeHRM_ExcelTestDataFile); 
		
		XSSFSheet  workbooksheet = OrangeHRMExcelData.getSheet("Sheet4");
		
		Row sheetRow = workbooksheet.getRow(1);
		
		Cell RowOfCell = sheetRow.getCell(0);
		String Usernamedata  =	RowOfCell.getStringCellValue();
System.out.println(Usernamedata);

		//System.out.println(UsernameTestdata);
		String	UsernameProperty	= "txtUsername";
		driver.findElement(By.id(UsernameProperty)).sendKeys(Usernamedata);
		
		Cell RowOfCell1 = sheetRow.getCell(1);

		String Testdata1  =	RowOfCell1.getStringCellValue();
		System.out.println(Testdata1);
	
		String  PasswordProperty =	"txtPassword";
		driver.findElement(By.name(PasswordProperty)).sendKeys(Testdata1);

		 String LoginButtonProperty ="Submit";
			driver.findElement(By.name(LoginButtonProperty)).click();
			
		  	String	ActualLoginPageTitle = driver.getTitle();
		  	System.out.println(" The Actual Login Page Title  is :- "+ActualLoginPageTitle);
		  	String ExpectedLoginPageTitle ="OrangeHrm";
		  	System.out.println("The Expected Login Page Title is :- "+ExpectedLoginPageTitle);
			
			
		 	if (ActualLoginPageTitle.equalsIgnoreCase(ExpectedLoginPageTitle))
			{
		  		
			System.out.println("orangeHrm Login Page Title is verified Successfully :-  PASS");
			}			
			else {
				System.out.println("orangeHrm Login page Title is not verified Successfully :-  FAIL");
				

//		  	Row sheetofnewRow = workbooksheet.createRow(1);
			   Cell TestResultOfCell =	sheetRow.createCell(2);
			   TestResultOfCell.setCellValue("orangeHrm Login Page Title is verified Successfully :-  PASS");
			}
			   FileOutputStream  saveExceltestDataFile = new FileOutputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
			   OrangeHRMExcelData.write(saveExceltestDataFile);
			




			
				

		
		
		
	}

}
