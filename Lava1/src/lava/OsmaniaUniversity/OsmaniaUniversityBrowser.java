package lava.OsmaniaUniversity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OsmaniaUniversityBrowser {
WebDriver  driver;

public void OUBrowser() {
	System.setProperty("webdriver.driver.chromedriver", "F:\\Selenium Workspace\\Lava1\\BrowserDriverFiles\\chromedriver.exe");

	driver = new ChromeDriver();
String	browserUrl  = "https://OsmaniaUniversity.com";
	driver.get(browserUrl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

public void OUclose() {
	driver.close();
}
}
