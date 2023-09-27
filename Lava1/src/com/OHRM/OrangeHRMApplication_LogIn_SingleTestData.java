package com.OHRM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMApplication_LogIn_SingleTestData {
	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");

		// ChromeDriver driver = new ChromeDriver();
		// OR
		// WebDriver - its an interface in selenium

		//WebDriver driver = new ChromeDriver();
		              // OR
		WebDriver driver;
		driver = new ChromeDriver();

		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		driver.get(applicationUrlAddress);

		driver.manage().window().maximize();

		// implicitlyWait - is a Global wait / smart wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// <input name="txtUsername" id="txtUsername" type="text">
		// driver.findElement(By.id("txtUsername")).sendKeys("lavakumar");

		                // OR

		// identifying the Element on the WebPage - with the Property
		// Identified Element is assigned to a variable
		// The variable is getting saved with an identified element on the WebPage - declaration
//		    should be as of Type WebElement
		//WebElement userName=driver.findElement(By.id("txtUsername"));
		// userName.sendKeys("srini");

		// OR
		// identifying the Excel file
FileInputStream orangeHRMLogInTestDataFile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
XSSFWorkbook logInTestDataWorkBook = new XSSFWorkbook(orangeHRMLogInTestDataFile);
XSSFSheet logInTestDataWorkBookSheet = logInTestDataWorkBook.getSheet("Logintestdata");

		Row testDataRow=logInTestDataWorkBookSheet.getRow(1);

		Cell userNameTestDataCell=testDataRow.getCell(0);
		String userNameTestData=userNameTestDataCell.getStringCellValue();

		System.out.println(" The UserName Test Data is :- "+userNameTestData);

		// identifying the properties file
	FileInputStream propertiesFile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\src\\lava\\config\\OrangeHrmApplication.properties");
		Properties properties = new Properties();
		properties.load(propertiesFile);//loading the properties file

		// String userNameTestData="srini";
		By userNameProperty=By.id(properties.getProperty("OrangeHrmUserNameProperty"));
		WebElement userName=driver.findElement(userNameProperty);

		userName.clear();
		userName.sendKeys(userNameTestData);

		Cell passwordTestDataCell=testDataRow.getCell(1);
		String passwordTestData=passwordTestDataCell.getStringCellValue();

		System.out.println(" The UserName Test Data is :- "+passwordTestData);

		// String passwordTestData="Omvinayaka1$";
		// <input name="txtPassword"  autocomplete="off" type="password">
		By passwordProperty=By.name(properties.getProperty("logInPagePasswordProperty"));
		WebElement password=driver.findElement(passwordProperty);

		password.clear();
		password.sendKeys(passwordTestData);

		// <input type="submit" class="button"  value="LOGIN">
		By logInPageLogInButtonProperty=By.className(properties.getProperty("logInPageLogInButtonProperty"));
		WebElement logInPageLogInButton=driver.findElement(logInPageLogInButtonProperty);
		logInPageLogInButton.click();

		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>

		By homePageWelComeAdminProperty=By.id(properties.getProperty("homePageWelComeAdminProperty"));
		WebElement homePageWelComeAdmin=driver.findElement(homePageWelComeAdminProperty);

		Cell expectedHomePageTextCell=testDataRow.getCell(2);
		String expectedHomePageText=expectedHomePageTextCell.getStringCellValue();

		String expected_OrangeHRMApplicationHomePageText=expectedHomePageText;
		System.out.println(" The expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

		String actual_OrangeHRMApplicationHomePageText=homePageWelComeAdmin.getText();
		System.out.println(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

		if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
		{
		System.out.println(" Successfully Navigated to OrangeHRM Application Home Page - PASS");

		// Row testResultRow=logInTestDataWorkBookSheet.createRow(1);
		Cell testResultRowOfCell=testDataRow.createCell(3);
		testResultRowOfCell.setCellValue("Successfully Navigated to OrangeHRM Application Home Page - PASS");

		}
		else
		{
		System.out.println(" Failed to Navigated to OrangeHRM Application Home Page - FAIL");

		// Row testResultRow=logInTestDataWorkBookSheet.createRow(1);
		Cell testResultRowOfCell=testDataRow.createCell(3);
		testResultRowOfCell.setCellValue("Failed to Navigated to OrangeHRM Application Home Page - FAIL");

		}

		FileOutputStream testDataResultFile = new FileOutputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
		logInTestDataWorkBook.write(testDataResultFile);

		homePageWelComeAdmin.click();

		// Synchronization
		//Thread.sleep(5000); // Java Wait
		// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>


		By homePageLogOutProperty=By.linkText(properties.getProperty("OrangeHrmLogOutProperty"));

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(homePageLogOutProperty));

		WebElement homePageLogOut=driver.findElement(homePageLogOutProperty);
		homePageLogOut.click();

		driver.quit();


		}



}
