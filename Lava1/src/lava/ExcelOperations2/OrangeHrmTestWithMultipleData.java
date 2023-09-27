package lava.ExcelOperations2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmTestWithMultipleData {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	WebDriver driver;
	driver= new ChromeDriver();
	
String	ApplicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver.get(ApplicationUrl);
	FileInputStream ExcelFile = new FileInputStream("./ExcelWorkBook/ExcelBasic1.xlsx");
	XSSFWorkbook ExcelBook = new XSSFWorkbook(ExcelFile);
	XSSFSheet ExcelSheet =ExcelBook.getSheet("Logintestdata");
	Row TestDataRow =ExcelSheet.getRow(1);

	Cell Usernamecell =TestDataRow.getCell(0);
	String	 Usernamedata =  Usernamecell.getStringCellValue();  // get   Username 
	
	Cell PasswordCell = TestDataRow.getCell(1);
	String passworddata = PasswordCell.getStringCellValue();
//Login with username and password data from excel sheet
	By	UsernameProperty	= By.id("txtUsername");
	  WebElement    Username =driver.findElement(UsernameProperty);
	  Username.clear();
	  Username.sendKeys(Usernamedata);
	  
	By 	Passwordproperty = By.id("txtPassword");
	  WebElement 	Password	=driver.findElement(Passwordproperty);
		Password.clear();
		Password.sendKeys(passworddata);

	By	logInProperty =By.name("Submit");
   	WebElement	LoginButton= driver.findElement(logInProperty);
					LoginButton.click();

	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
