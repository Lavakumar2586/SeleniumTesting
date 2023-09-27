package lava.IframePath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JQuery_DragMeToMyTarget_GetText {

	WebDriver driver;

	@Test
	public void IframeProperty() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Workspace\\Lava1\\BrowserDriverFiles\\chromedriver.exe");
		driver= new ChromeDriver();
		String applicationUrlAddress="https://jqueryui.com/droppable/";
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
//Property of "Drag me to my Target"
		//<p>Drag me to my target</p>	==> It don't have any property, So goto Iframe==>
			//Iframe is a link to elaborate  in code
//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>		

	By	jQuery_WebPageFrameProperty =By.className("demo-frame");
WebElement	jQuery_WebPageFrame = driver.findElement(jQuery_WebPageFrameProperty);
		
//Switching into the frame of webpage
driver.switchTo().frame(jQuery_WebPageFrame);

//<div id="draggable" 

By dragMeToMyTargetProperty = By.id("draggable");
WebElement dragMeToMyTarget =	driver.findElement(dragMeToMyTargetProperty);
String dragMeToMyTarget_Text = dragMeToMyTarget.getText();
	System.out.println("The text of the element Drag me to My Target is :- "+ dragMeToMyTarget_Text );

	driver.quit();
	}
}
