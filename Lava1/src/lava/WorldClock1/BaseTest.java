package lava.WorldClock1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;			//declared Golbally
	String	  applicationUrl =  "https://www.timeanddate.com/worldclock/";
	
	@BeforeTest
	public void Applicationlaunch() {
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}

	@AfterTest
	public void ApplicationClose() {
		driver.quit();
	}
	
}
