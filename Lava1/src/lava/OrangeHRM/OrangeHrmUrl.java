package lava.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmUrl {
	WebDriver driver;
	public void AppLaunch() {
	System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	driver= new ChromeDriver();
		
String ApplicationURL	=	"http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver.get(ApplicationURL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}

	public void AppClose() {
		driver.close();
		
	}
	
	}


