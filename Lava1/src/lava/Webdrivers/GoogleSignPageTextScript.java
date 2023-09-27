package lava.Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSignPageTextScript {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromeDriver.exe");
 WebDriver driver = new ChromeDriver();
 	String GoogleUrl ="http:google.com";
 	driver.get(GoogleUrl);
 	driver.manage().window().maximize();
//linktext property for Sign In is =>  "Sign In"	
   By SignInProperty	= By.linkText("Sign in");
   WebElement signIn = driver.findElement(SignInProperty);
   signIn.click();
	}

}
