package lava.ExcelOperations1;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHrmLogInValidation {

	//Write the programme  of validating OrangeHrm Page
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Workspace\\Lava1\\BrowserDriverFiles\\chromedriver.exe");
WebDriver driver;
driver=new ChromeDriver();
String applicationurl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(applicationurl);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//read logindata from Excel
		FileInputStream Excelfile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
		XSSFWorkbook Workbook = new XSSFWorkbook(Excelfile);
		XSSFSheet workSheet = Workbook.getSheet("Logintestdata");
		
		Row Rowdata=workSheet.getRow(1);
		Cell UsernameCelldata= Rowdata.getCell(0);
	String	usernameTestdata = UsernameCelldata.getStringCellValue();
System.out.println("The value of Username is :-  "+ usernameTestdata); 

//<input name="txtUsername" id="txtUsername" type="text">
By	UsernameProperty	= By.id("txtUsername");
  WebElement    Username =driver.findElement(UsernameProperty);
  Username.clear();
  Username.sendKeys(usernameTestdata);
  Cell passwordCelldata = Rowdata.getCell(1);
  		String	passwordTestdata = passwordCelldata.getStringCellValue();
  System.out.println("The value of Password is :-  "+ passwordTestdata); 
  
//		<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">		
  		By 	Passwordproperty = By.id("txtPassword");
 WebElement 	Password	=driver.findElement(Passwordproperty);
 			Password.clear();
 			Password.sendKeys(passwordTestdata);
 //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	By	logInProperty =By.name("Submit");
WebElement	LoginButton= driver.findElement(logInProperty);
			LoginButton.click();
//*************************************************************************	
	By WelcomeAdminproperty=By.id("welcome");
	WebElement WelcomeAdminText=driver.findElement(WelcomeAdminproperty);

	Cell WelcomeCell=Rowdata.getCell(2);
	String WelcomeTestdata=WelcomeCell.getStringCellValue();

	String ExpectedWelcomeAdminText=WelcomeTestdata;
	System.out.println(" The expected Text of OrangeHRM Application HomePage is :- "+ExpectedWelcomeAdminText);

	String Actual_WelcomeAdminText=WelcomeAdminText.getText();
	System.out.println(" The actual Text of OrangeHRM Application HomePage is :- "+Actual_WelcomeAdminText);
	

//*************************************************************************			
	if(Actual_WelcomeAdminText.contains(ExpectedWelcomeAdminText)) {
		System.out.println("Pass");
//below 2 lines of code is very.....Important.  we save the data in same row (Rowdata.createCell).*****		
		Cell testResultCell = Rowdata.createCell(3);
		testResultCell.setCellValue("Pass");
			} 
	
	else {
		System.out.println("Fail");
//below 2 lines of code is very.....Important.  we save the data in same row (Rowdata.createCell).*****		
		Cell testResultCell = Rowdata.createCell(3);
		testResultCell.setCellValue("Fail");
		}
//******************************************************************************
//To save the file
	FileOutputStream testdataResultFile = new FileOutputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
	Workbook.write(testdataResultFile);
	driver.quit();
	
	
	
		
		
	
		
	}

}
