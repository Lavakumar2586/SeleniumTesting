package com.BaseTest_Log4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class AddEmployeeTest extends BaseTest {
	WebDriver driver;
	Logger log = Logger.getLogger("AddEmployeeTest");
@Test(priority=1,description="Validating LogIn Functionality")
	public void logInTest() throws IOException {
	String expected_logInPanel="LOGIN Panel";
	log.info(" The expected LogIn Page Text is :- "+expected_logInPanel);

	By logInPanelProperty=By.id("logInPanelHeading");
	WebElement logInPanel=driver.findElement(logInPanelProperty);
	String actual_logInPanelText=logInPanel.getText();
	//System.out.println(" The actual logIn Page Text is :- "+actual_logInPanelText);
	log.info(" The actual logIn Page Text is :- "+actual_logInPanelText);

	if(actual_logInPanelText.equals(expected_logInPanel))
	{
	//System.out.println(" Successfully Navigated to OrangeHRM Application LogIN Page - PASS");
	log.info(" Successfully Navigated to OrangeHRM Application LogIN Page - PASS");
	}
	else
	{
	// System.out.println(" Failed to Navigate to OrangeHRM Application Application LogIn page - FAIL");
	}

	FileInputStream orangeHRMLogInTestDataFile = new FileInputStream("./src/com/OrangeHRMApplicationTestDataFiles/OHRM_LogInTestData.xlsx");
	XSSFWorkbook logInTestDataWorkBook = new XSSFWorkbook(orangeHRMLogInTestDataFile);
	XSSFSheet logInTestDataWorkBookSheet = logInTestDataWorkBook.getSheet("OrangeHRMLogInTestData");

	Row testDataRow=logInTestDataWorkBookSheet.getRow(1);

	Cell userNameTestDataCell=testDataRow.getCell(0);
	String userNameTestData=userNameTestDataCell.getStringCellValue();

	//System.out.println(" The UserName Test Data is :- "+userNameTestData);
	log.info(" The UserName Test Data is :- "+userNameTestData);

	// identifying the properties file
	FileInputStream propertiesFile = new FileInputStream
	("./src/com/Config/OrangeHRMApplication.properties");
	Properties properties = new Properties();
	properties.load(propertiesFile);//loading the properties file

	// String userNameTestData="srini";
	By userNameProperty=By.id(properties.getProperty("logInPageUserNameProperty"));
	WebElement userName=driver.findElement(userNameProperty);

	userName.clear();
	userName.sendKeys(userNameTestData);

	Cell passwordTestDataCell=testDataRow.getCell(1);
	String passwordTestData=passwordTestDataCell.getStringCellValue();

	// System.out.println(" The UserName Test Data is :- "+passwordTestData);


	// String passwordTestData="Q@Trainer7";
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
	//System.out.println(" The expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

	log.info(" The expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

	String actual_OrangeHRMApplicationHomePageText=homePageWelComeAdmin.getText();
	//System.out.println(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

	log.info(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

	if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
	{
	//System.out.println(" Successfully Navigated to OrangeHRM Application Home Page - PASS");
	log.info(" Successfully Navigated to OrangeHRM Application Home Page - PASS");

	// Row testResultRow=logInTestDataWorkBookSheet.createRow(1);
	Cell testResultRowOfCell=testDataRow.createCell(3);
	testResultRowOfCell.setCellValue("Successfully Navigated to OrangeHRM Application Home Page - PASS");

	}
	else
	{
	//System.out.println(" Failed to Navigated to OrangeHRM Application Home Page - FAIL");

	log.info(" Failed to Navigated to OrangeHRM Application Home Page - FAIL");

	// Row testResultRow=logInTestDataWorkBookSheet.createRow(1);
	Cell testResultRowOfCell=testDataRow.createCell(3);
	testResultRowOfCell.setCellValue("Failed to Navigated to OrangeHRM Application Home Page - FAIL");

	}

	FileOutputStream testDataResultFile = new FileOutputStream("./src/com/OrangeHRMApplicationTestResultFiles/OHRM_LogInTestResultFile.xlsx");
	logInTestDataWorkBook.write(testDataResultFile);


	}

	@Test(priority=2,description=" Validating PIM functionality")
	public void pimTest()
	{

	// id="menu_pim_viewPimModule"
	By pimProperty=By.id("menu_pim_viewPimModule");
	WebElement pim=driver.findElement(pimProperty);

	Actions pimAction = new Actions(driver);
	pimAction.moveToElement(pim).build().perform();

	log.info(" Successfully performed Mouse Hover Operation on PIM ");
	}

	@Test(priority=3,description=" Validating Add Employee functionality")
	public void addEmployeeTest()
	{
	// id="menu_pim_addEmployee"
	By addEmployeeProperty=By.id("menu_pim_addEmployee");
	WebElement addEmployee=driver.findElement(addEmployeeProperty);
	addEmployee.click();

	}

	@Test(priority=4,description=" Validating Add NEW Employee functionality")
	public void addNewEmployeeTest() throws IOException, InterruptedException
	{

	// id="firstName"
	By firstNameProperty=By.id("firstName");
	WebElement firstName=driver.findElement(firstNameProperty);
	firstName.sendKeys("Srini001");

	// id="middleName"
	// performing TAB operation
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.TAB).build().perform();

	// sending the Test data into Middle name
	actions.sendKeys("Hello001").build().perform();

	// Actions actions = new Actions(driver);
	actions.sendKeys(Keys.TAB).build().perform();

	// sending the Test data into Middle name
	actions.sendKeys("Chello001").build().perform();

	actions.sendKeys(Keys.TAB).build().perform();
	// Photograph
	actions.sendKeys(Keys.TAB).build().perform();
	// performing Enter Key of the KeyBoard Operation

	actions.sendKeys(Keys.ENTER).build().perform();

	Thread.sleep(5000);

	java.lang.Runtime.getRuntime().exec("./AutoITScripts/EmployeePhotographImageUpload.exe");

	log.info(" Successfully Automated Uploading Photograh to the Application");
	Thread.sleep(5000);

	By saveButtonProperty=By.id("btnSave");
	WebElement saveButton=driver.findElement(saveButtonProperty);
	saveButton.click();

	// Validating the Image
	// id="empPic"

	By employeePhotographProperty=By.id("empPic");
	WebElement employeePhotograph=driver.findElement(employeePhotographProperty);

	boolean flag=employeePhotograph.isDisplayed();

	if(flag)
	{
	//System.out.println(" Employee Photograph Successfully Uploaded to the OrangeHRM Application ");
	log.info(" Employee Photograph Successfully Uploaded to the OrangeHRM Application ");
	}
	else
	{
	System.out.println(" Employee Photograph Failed to Upload to the OrangeHRM Application ");
	log.info(" Employee Photograph Failed to Upload to the OrangeHRM Application ");
	}

	}

	@Test(priority=5,description=" Validating LogOut functionality")
	public void logOutTest() throws IOException, InterruptedException
	{
	// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	By homePageWelComeAdminProperty=By.id("welcome");
	WebElement homePageWelComeAdmin=driver.findElement(homePageWelComeAdminProperty);
	homePageWelComeAdmin.click();

	// Synchronization
	//Thread.sleep(5000); // Java Wait
	// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>


	By homePageLogOutProperty=By.linkText("Logout");

	// Explicit wait
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(homePageLogOutProperty));

	WebElement homePageLogOut=driver.findElement(homePageLogOutProperty);
	homePageLogOut.click();

	log.info(" Successfully Logged Out of OrangeHRM Application  ");
	}



	
		
	}
	


