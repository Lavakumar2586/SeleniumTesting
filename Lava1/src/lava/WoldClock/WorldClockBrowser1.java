package lava.WoldClock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WorldClockBrowser1 {

	WebDriver driver;
@Test
public void WorldClockUrl() {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium Workspace\\Lava1\\BrowserDriverFiles\\chromedriver.exe");
	driver= new ChromeDriver();
	String ApplicationUrl ="https://www.timeanddate.com/worldclock/";
		driver.get(ApplicationUrl);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		}

public void WorldCloseClose() {
	driver.close();
	
}
}
