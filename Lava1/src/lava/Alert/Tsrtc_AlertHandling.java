package lava.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tsrtc_AlertHandling {

	WebDriver driver;
String 	ApplicationURL = "https://www.tsrtconline.in/oprs-web/";
@Test
public void TsrtcAlert() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "F:\\Selenium Workspace\\Lava1\\BrowserDriverFiles\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.navigate().to(ApplicationURL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	
	//<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" 
By CheckAvailabilityProperty	= By.id("searchBtn") ;
WebElement CheckAvailabilityButton=driver.findElement(CheckAvailabilityProperty);
CheckAvailabilityButton.click();
//To handle Alert message we use Alert
Alert Tsrtc_AlertHandling = driver.switchTo().alert();
Thread.sleep(5000);
Tsrtc_AlertHandling.accept();	//Perform operation on the OK Button
//Tsrtc_AlertHandling.dismiss();	//Perrform operation on the Cancel Button
//Tsrtc_AlertHandling.sendKeys("Testdata");	//sending testdata into the alert window

driver.quit();

}
}
