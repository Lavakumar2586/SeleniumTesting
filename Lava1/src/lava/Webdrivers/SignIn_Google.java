package lava.Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn_Google {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	String url = "https://google.com";
	driver.navigate().to(url);
	
	/*
	<a class="gb_ta gb_qd gb_Sd gb_qe" 
//href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
	continue=https://www.google.com/&amp;ec=GAZAmgQ" 
//target="_top"><span class="gb_Od">Sign in</span></a>
	*/
	
	/*  1st method to approach the click on Sign In .
	 * By SignInProperty=By.linkText("Sign in");   (or) 
	 * By SignInProperty=By.partiallinkText("in");
	 * WebElement signIn = driver.findElement(SignInProperty);
	 *  signIn.click();
	 */
	
	// 2nd method to approach the click on Sign In
	driver.findElement(By.linkText("Sign in")).click();
	
	
	
	
	
	
	
	
}
}
