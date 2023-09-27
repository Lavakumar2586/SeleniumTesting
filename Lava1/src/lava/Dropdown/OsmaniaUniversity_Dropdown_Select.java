package lava.Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import okhttp3.internal.connection.RouteSelector.Selection;

public class OsmaniaUniversity_Dropdown_Select {
	WebDriver driver;

// To browse url
	public void OsmaniaUniversityUrl() {
		System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	String	ApplicationUrl = "https://www.osmania.ac.in/";
	driver.get(ApplicationUrl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
//to close browser
	public void applicationClose() {
		driver.close();
	}

//to select Dropdown
	public void dropdownOptionalValueSelection() {
//id="gtranslate_selector"  => Select Language dropdown property
	By SelectDropdownProperty =	By.id("gtranslate_selector");
  WebElement selectdropdown	=	driver.findElement(SelectDropdownProperty);
//<option value="en|hi">Hindi</option>
  //<option value="en|fr">French</option>
  //<option value="en|de">German</option>
  //finding all the optional values of the dropdown
    By dropdownlanguagesproperty = By.tagName("option");
     List<WebElement> dropdownlanguages	=	driver.findElements(dropdownlanguagesproperty);
     	int	dropdownlanguagesCount=  dropdownlanguages.size();
     	System.out.println(dropdownlanguagesCount);
     	
     	for ( int index=0; index<dropdownlanguagesCount; index++) {
 //    	if(dropdownlanguages.get(index).isDisplayed()) {}	
     	String	dropdownlanguage = dropdownlanguages.get(index).getText();
     	System.out.println(index + "   =>    "+dropdownlanguage);
     	Select selection = new Select(selectdropdown);
     //selection will be done by three ways => index, value, Visibletext
     	//selection.selectByIndex(7);
     	//selection.selectByValue("en|hi"); 		//<option value="en|hi">Hindi</option>
selection.selectByVisibleText("Malayalam");
//desection of selected optional values
selection.deselectByVisibleText("Hindi");
//<option value="en|hi">Hindi</option>
selection.deselectByValue("en|hi");
//Deselection of all the selected optional values at once
selection.deselectAll();
//selectdropdown.click();

     	}
     	
	}


	
	
	
	public static void main(String[] args) {
	OsmaniaUniversity_Dropdown_Select D1 = new OsmaniaUniversity_Dropdown_Select();
	D1.OsmaniaUniversityUrl();
	D1.dropdownOptionalValueSelection();
	D1.applicationClose();

	}

	
	
	
	
}
