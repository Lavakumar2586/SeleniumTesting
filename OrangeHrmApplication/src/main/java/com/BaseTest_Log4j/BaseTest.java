package com.BaseTest_Log4j;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
@Test
	public void OrangeHrm(){
	WebDriver driver;

	driver = new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver", "F:\\Selenium Workspace\\OrangeHrmApplication\\BrowserDriverFiles\\chromedriver.exe");
	driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
driver.manage().window().maximize();

	}

}