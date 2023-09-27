package lava.DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_DragAndDrop_Operation {
public static void main(String[] args) {

	
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium Workspace\\Lava1\\BrowserDriverFiles\\chromedriver.exe");
	WebDriver driver;
	driver= new ChromeDriver();
	String applicationUrlAddress="https://jqueryui.com/droppable/";
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	
	By	jQuery_WebPageFrameProperty =By.className("demo-frame");
WebElement	jQuery_WebPageFrame = driver.findElement(jQuery_WebPageFrameProperty);
		
//Switching into the frame of webpage
driver.switchTo().frame(jQuery_WebPageFrame);

//draggable element Properties
//<div id="draggable" 

By dragMeToMyTargetProperty = By.id("draggable");
WebElement dragMeToMyTarget =	driver.findElement(dragMeToMyTargetProperty);
String dragMeToMyTarget_Text = dragMeToMyTarget.getText();
	System.out.println("The text of the element Drag me to My Target is :- "+ dragMeToMyTarget_Text );

//<div id="droppable" class="ui-widget-header ui-droppable">
 By	droppableProperty = By.id("droppable");
WebElement droppable = driver.findElement(droppableProperty);
	
//To perform Operations use Actions class
Actions dragOperationAction = new Actions(driver);
//To drag and drop use draganddrop
dragOperationAction.dragAndDrop(dragMeToMyTarget, droppable).build().perform();
driver.switchTo().defaultContent(); 
By resizableProperty=By.linkText("Resizable");
WebElement resizable=driver.findElement(resizableProperty);
resizable.click();

String resizableWebPageTitle=driver.getTitle();
System.out.println(" The title of the Reziable webPage is :- "+resizableWebPageTitle);
driver.quit();

	}
}
