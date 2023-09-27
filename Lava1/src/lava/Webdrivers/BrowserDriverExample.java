package lava.Webdrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriverExample {

	public static void main(String[] args) {
		
		System.out.println("this is my first programme on browsers");
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium Workspace\\Lava1\\BowserDriver\\chromedriver.exe");	
   ChromeDriver  driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.navigate().to("https://flipkart.com");
   driver.navigate().to("https://amazon.com");
   driver.navigate().to("https://Google.com");
   driver.get("https://flipkart.com");
   driver.close();
	}
}
