package lava.Screenshots;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingBrowserInteraction {
	WebDriver driver;
	
	public void applicationlaunch() {
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		String ApplicationUrl = "https://bing.com";
		driver.get(ApplicationUrl);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void applicationclose() {
		driver.close();
	}
	
	
}
