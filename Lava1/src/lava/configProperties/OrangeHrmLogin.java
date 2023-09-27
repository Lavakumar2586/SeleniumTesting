package lava.configProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHrmLogin {

	@Test
	public void OrangehrmLogin() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		driver.get(applicationUrlAddress);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//by using the below details we get the properties of the elements. while change the property anytime we willchange the properties file
		FileInputStream propertiesfile = new FileInputStream("F:\\Selenium Workspace\\Lava1\\src\\lava\\config\\OrangeHrmApplication.properties");
		Properties properties = new Properties();
		properties.load(propertiesfile);
		
		By userNameProperty=By.id(properties.getProperty("OrangeHrmUserNameProperty"));
		WebElement userName=driver.findElement(userNameProperty);

		userName.clear();
		userName.sendKeys("Lavakumar");

		By passwordProperty=By.name(properties.getProperty("logInPagePasswordProperty"));
		WebElement password=driver.findElement(passwordProperty);

		password.clear();
		password.sendKeys("Omvinayaka1@");
		
		By logInPageLogInButtonProperty=By.className(properties.getProperty("logInPageLogInButtonProperty"));
		WebElement logInPageLogInButton=driver.findElement(logInPageLogInButtonProperty);
		logInPageLogInButton.click();
		
		By homePageWelComeAdminProperty=By.id(properties.getProperty("homePageWelComeAdminProperty"));
		WebElement homePageWelComeAdmin=driver.findElement(homePageWelComeAdminProperty);
		homePageWelComeAdmin.click();

		By homePageLogOutProperty=By.linkText(properties.getProperty("OrangeHrmLogOutProperty"));
		WebElement homePageLogOut=driver.findElement(homePageLogOutProperty);
		homePageLogOut.click();

		driver.quit();


		

		
		
		
	}
}
