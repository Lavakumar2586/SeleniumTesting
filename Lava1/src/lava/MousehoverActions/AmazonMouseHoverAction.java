package lava.MousehoverActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseHoverAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Workspace\\Lava1\\BrowserDriverFiles\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
  String AmazonUrl	=	"https://amazon.com";
		driver.get(AmazonUrl);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//id="nav-link-accountList ==>> Property of Hello SignIn element
By	helloSignInProperty =	By.id("nav-link-accountList");
   WebElement  helloSignIn =	driver.findElement(helloSignInProperty);

   //without Clicking Only mousehover Operation we use Actions
    Actions actions = new Actions(driver);
  
 //   actions.moveToElement(helloSignIn);
    actions.moveToElement(helloSignIn).build().perform();
  //<span class="nav-text">Your Wish List</span>  	
      By yourListProperty=By.linkText("Your Wish List");
    WebElement  yourwishList=driver.findElement(yourListProperty);
    yourwishList.click();
    String webpageTitle = driver.getTitle();
    System.out.println("The title of webpage is :- "+webpageTitle);
     
   
	}
}
