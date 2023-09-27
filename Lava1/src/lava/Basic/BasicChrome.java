package lava.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicChrome {
public static void main(String[] args) throws InterruptedException {
	System.out.println("this is lava kumar");
	System.setProperty("webdriver.chrome.driver", 
			"F:\\Selenium Workspace\\Lava1\\BrowserDriverFiles\\chromedriver.exe");
 //ChromeDriver driver = new ChromeDriver();	
 WebDriver driver = new  ChromeDriver();
 
driver.manage().window().maximize(); 
 // 3 ways we are approaching to open urladdress.
 
//1=>driver.navigate().to("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");

//2=>driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login"); 
 
String OrangeHrmUrl= "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login" ;
driver.get(OrangeHrmUrl);

String OrangeHrmHpTitle=driver.getTitle();
System.out.println(OrangeHrmHpTitle);
String OrangeHrmPageUrl = driver.getCurrentUrl();
System.out.println(OrangeHrmPageUrl);

// enter username in the Blankfield 
//<input name="txtUsername" id="txtUsername" type="text">
driver.findElement(By.id("txtUsername")).sendKeys("lavakumar");;

//enter password in the Blankfield
//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
driver.findElement(By.id("txtPassword")).sendKeys("Omvinayaka1$");

//click on login button
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
driver.findElement(By.id("btnLogin")).click();

//Click on welcome orangehrm on leftside of a pic 
//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
driver.findElement(By.id("welcome")).click();

Thread.sleep(5000);
//click  on Logout button
//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
driver.findElement(By.partialLinkText("Logout")).click();



}
}
