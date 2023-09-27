package lava.ExcelOpertions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
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

public class Assignment_LoginOrangeHrm {

	public static void main(String[] args) throws Throwable {
// (1) Automate Browser;
System.setProperty("webdriver.chrome.driver", "F:\\Selenium Workspace\\Lava1\\BrowserDriverFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
// (2) Navigate to Application Url Address		
	String	OrangeHrm="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
			driver.get(OrangeHrm);
			driver.manage().window().maximize();
		//Apply ImplicitlyWait
		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
// (3) Validating LoginWebpage	=>Title Should be --OrangeHrm	=>Url Should have --OrangeHrm-4.2.0.1	=>text Should be  --Login Panel

//Validating Title -> Title Should be OrangeHrm
			String	ActualOrangeHrmTitle = driver.getTitle();
		System.out.println("Actual WebPage of OrangeHrm Title is :- "+ActualOrangeHrmTitle);
			String ExpectedOrangeHrmTitle ="OrangeHrm";
		System.out.println("ExpectedOrangeHrmTitle is :- "+ExpectedOrangeHrmTitle);


			if (ActualOrangeHrmTitle.equalsIgnoreCase(ExpectedOrangeHrmTitle))
			{
				System.out.println("orangeHrm Title is verified Successfully :-  PASS");
			}			
			else {
				System.out.println("orangeHrm Title is not verified Successfully :-  FAIL");
				}
				System.out.println("***************************");
			
//Validating Url =>Url Should have --OrangeHrm-4.2.0.1
			String  ActualOrangeHrmUrl=driver.getCurrentUrl();
		System.out.println("Actual webpage of OrangeHrm url is :- "+ ActualOrangeHrmUrl);
			String ExpectedOrangeHrmUrl ="orangehrm-4.2.0.1";
			System.out.println("ActualOrangeHrmUrl is :-   "+ActualOrangeHrmUrl);
			System.out.println("ExpectedOrangeHrmUrl is :-   "+ExpectedOrangeHrmUrl);
			if (ActualOrangeHrmUrl.contains(ExpectedOrangeHrmUrl))
			{
				System.out.println("orangeHrm Url is verified Successfully :-  PASS");
			}			
			else {
				System.out.println("orangeHrm Url is not verified Successfully :-  FAIL");
				}
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	//Validating Login   =>text Should be  --Login Panel
	//<div id="logInPanelHeading">LOGIN Panel</div>
	String LoginPanel = "logInPanelHeading";
	String	ActualloginPanelText	= driver.findElement(By.id(LoginPanel)).getText();
	System.out.println("The Actual Login Text of the Login Panel :-  "+ ActualloginPanelText);
		String ExpectedLoginPanelText = "Login Panel";
	System.out.println("ActualloginPanelText is :-  "+ ExpectedLoginPanelText);
		
		if (ActualloginPanelText.equalsIgnoreCase(ExpectedLoginPanelText))
		{
			System.out.println("orangeHrm LoginPanel text is verified Successfully :-  PASS");
		}			
		else {
			System.out.println("orangeHrm LoginPanel text is not verified Successfully :-  FAIL");
			}
		System.out.println("###########################");
// (4) Login to Application With valid data		
//Enter Username
	//<input name="txtUsername" id="txtUsername" type="text">
//			String	UsernameProperty	= "txtUsername";
	//		String	 Username 	=	"Lavakumar";
		//	driver.findElement(By.id(UsernameProperty)).sendKeys(Username);
	
  //by using username data from Excel File
		FileInputStream  OrangeHRM_ExcelTestDataFile =new FileInputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");

		XSSFWorkbook OrangeHRMExcelData = new XSSFWorkbook(OrangeHRM_ExcelTestDataFile); 
		
		XSSFSheet  workbooksheet = OrangeHRMExcelData.getSheet("ReadSingleTestData");
		
		Row sheetRow = workbooksheet.getRow(1);
		
		Cell RowOfCell = sheetRow.getCell(0);
		String Usernamedata  =	RowOfCell.getStringCellValue();
System.out.println(Usernamedata);
		//System.out.println(UsernameTestdata);
		String	UsernameProperty	= "txtUsername";
		driver.findElement(By.id(UsernameProperty)).sendKeys(Usernamedata);

			
				
//Enter Password
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
//			String  PasswordProperty =	"txtPassword";
	//		String	Password	= "Omvinayaka1$";	
		//	driver.findElement(By.name(PasswordProperty)).sendKeys(Password);
		
// Enter Password using Excel Sheet
		
	//	Row sheetRow1 = workbooksheet.getRow(1);
		//Cell RowOfCell1 = sheetRow1.getCell(1);
		Cell RowOfCell1 = sheetRow.getCell(1);

		String Testdata1  =	RowOfCell1.getStringCellValue();
		System.out.println(Testdata1);
	
		String  PasswordProperty =	"txtPassword";
		driver.findElement(By.name(PasswordProperty)).sendKeys(Testdata1);

		
//Click on Login button
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">		
	
	 String LoginButtonProperty ="Submit";
		driver.findElement(By.name(LoginButtonProperty)).click();

// (5)  Validating HomePage		=>Title should be --OrangeHrm 	=>Text should have--Welcome
//=>Title should be --OrangeHrm
  	String	ActualLoginPageTitle = driver.getTitle();
  	System.out.println(" The Actual Login Page Title  is :- "+ActualLoginPageTitle);
  	String ExpectedLoginPageTitle ="OrangeHrm";
  	System.out.println("The Expected Login Page Title is :- "+ExpectedLoginPageTitle);

/*   		Row sheetofnewRow = workbooksheet.createRow(6);
	   Cell newRowOfCell =	sheetofnewRow.createCell(5);
	   newRowOfCell.setCellValue("Livetech");
	   FileOutputStream  saveExceltestDataFile = new FileOutputStream("F:\\\\Selenium Workspace\\\\Lava1\\\\ExcelWorkBook\\\\ExcelBasic1.xlsx");
	   	ExcelworkBook.write(saveExceltestDataFile);
	*/	

  	if (ActualLoginPageTitle.equalsIgnoreCase(ExpectedLoginPageTitle))
	{
  		
	System.out.println("orangeHrm Login Page Title is verified Successfully :-  PASS");
	}			
	else {
		System.out.println("orangeHrm Login page Title is not verified Successfully :-  FAIL");
		

//  	Row sheetofnewRow = workbooksheet.createRow(1);
	   Cell TestResultOfCell =	sheetRow.createCell(2);
	   TestResultOfCell.setCellValue("orangeHrm Login Page Title is verified Successfully :-  PASS");
	}
	   FileOutputStream  saveExceltestDataFile = new FileOutputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
	   OrangeHRMExcelData.write(saveExceltestDataFile);
	

  	System.out.println("***************************");
		
//=>Text should have--Welcome
//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		String WelcomeProperty = "welcome";
	String	ActualWelcometext=driver.findElement(By.id(WelcomeProperty)).getText();
		System.out.println("The Actual Welcome text of Login Page is :-  "+ ActualWelcometext);
		String ExpectedLoginPageWelcome ="Welcome";
       System.out.println("The  Expected Login Page Welcome text is :-  "+ExpectedLoginPageWelcome);
   	if (ActualWelcometext.contains(ExpectedLoginPageWelcome))
   	{
   		System.out.println("orangeHrm logi page Welcome text is verified Successfully :-  PASS");
   	}			
   	else {
   		System.out.println("orangeHrm Login page Welcome text  is not verified Successfully :-  FAIL");
   		}
   		System.out.println("***************************");
   		// Click on Welcome Admin
   		driver.findElement(By.id("welcome")).click();
	
   		Row sheetofnewRow1 = workbooksheet.createRow(2);
 	   Cell newRowOfCell1 =	sheetofnewRow1.createCell(2);
 	   newRowOfCell1.setCellValue("orangeHrm Login Page Title is verified Successfully :-  PASS");
 	   FileOutputStream  saveExceltestDataFile1 = new FileOutputStream("F:\\Selenium Workspace\\Lava1\\ExcelWorkBook\\ExcelBasic1.xlsx");
 	  OrangeHRMExcelData.write(saveExceltestDataFile1);
 		
//(6) Automate welcome admin => by using explicit wait
   	//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>   =>Use linktext
 //  	Thread.sleep(10000);
   	driver.findElement(By.partialLinkText("Logout")).click();
   	
//(7)Validating LogIn Page   =>Title should be  --OrangeHrm   =>Text Should have --LogIn    	
   	 //=>Title should be  --OrangeHrm 
	String	ActualOrangeHrmTitle1 = driver.getTitle();
	System.out.println("Actual WebPage of OrangeHrm Title1 is :- "+ActualOrangeHrmTitle1);
		String ExpectedOrangeHrmTitle1 ="OrangeHrm";
	System.out.println("ExpectedOrangeHrmTitle1 is :- "+ExpectedOrangeHrmTitle1);
	
		if (ActualOrangeHrmTitle1.equalsIgnoreCase(ExpectedOrangeHrmTitle1))
		{
			System.out.println("orangeHrm Title is verified Successfully :-  PASS");
		}			
		else {
			System.out.println("orangeHrm Title is not verified Successfully :-  FAIL");
			}
			System.out.println("***************************");

//=>Text Should have --LogIn  
			//<div id="logInPanelHeading">LOGIN Panel</div>
			String LoginPanel1 = "logInPanelHeading";
			String	ActualloginPanelText1	= driver.findElement(By.id(LoginPanel)).getText();
			System.out.println("The Actual Login Text of the Login Panel :-  "+ ActualloginPanelText1);
				String ExpectedLoginPanelText1 = "LOGIN";
			System.out.println("ActualloginPanelText1 is :-  "+ ExpectedLoginPanelText1);
				
				if (ActualloginPanelText1.contains(ExpectedLoginPanelText1))
				{
					System.out.println("orangeHrm LoginPanel text1 is verified Successfully :-  PASS");
				}			
				else {
					System.out.println("orangeHrm LoginPanel text1 is not verified Successfully :-  FAIL");
					}
		}
}
