
package lava.RadioButtons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtonsTesting {

	WebDriver driver;
String applicationUrl="https://echoecho.com/htmlforms10.htm";

@BeforeTest
 public void setUp() {				//In real time for launching application we will use setUp
System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
driver=new ChromeDriver();
driver.get(applicationUrl);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }

@AfterTest		
public void tearDown() {				//In real time for closing application we willuse tearDown
	driver.quit();
	}

@Test 
public void group1radiobuttonsTesting() throws InterruptedException {
	
	//Identify the Radio Buttons Property to inspect elements
	/*   <input type="radio" name="group1" value="Milk">
		 <input type="radio" name="group1" value="Butter" checked="">
		  <input type="radio" name="group1" value="Cheese">
	
		 <input type="radio" name="group2" value="Water">
		 <input type="radio" name="group2" value="Beer">
		 <input type="radio" name="group2" value="Wine" checked="">		*/
//   Identify radioButtons Block Property
//    /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table
	
By	RadiobuttonsblockProperty = By.xpath(" /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table");
WebElement	RadioButtonsblock=driver.findElement(RadiobuttonsblockProperty);
	
// Identify the group1 elements  of the radio buttons block
By group1RadioButtonsProperty=By.name("group1");

	List<WebElement> group1radiobuttons = RadioButtonsblock.findElements(group1RadioButtonsProperty);

System.out.println("The number of radio buttons in the group1 are :- "+group1radiobuttons.size());

//To perform click on each Radio Button
for (int btnClick=0; btnClick  < group1radiobuttons.size(); btnClick++) {
	group1radiobuttons.get(btnClick).click();
//	getting the status of every Radio Button When clicked
	for(int btnStatus = 0; btnStatus < group1radiobuttons.size() ;btnStatus++ ) {
String	group1RadioButtonsName	= group1radiobuttons.get(btnStatus).getAttribute("value")+"      "+group1radiobuttons.get(btnStatus).getAttribute("checked");
	System.out.println(group1RadioButtonsName);
	}
	System.out.println();
	Thread.sleep(5000);
	
}

}

}

