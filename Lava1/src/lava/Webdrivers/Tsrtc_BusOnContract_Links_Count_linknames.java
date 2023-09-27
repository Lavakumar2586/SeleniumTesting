package lava.Webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_BusOnContract_Links_Count_linknames {
	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
//ChromeDriver driver = new ChromeDriver();
	WebDriver driver = new ChromeDriver();
 String TsrtcUrl =	"https://www.tsrtc.telangana.gov.in/";
//   String TsrtcUrl = "https://www.tsrtconline.in/oprs-web/guest/specialHire.do";
		driver.get(TsrtcUrl);
		driver.manage().window().maximize();

// to get Tsrtc page Title		
String	TsrtcPageTitle=driver.getTitle();
 System.out.println("Tsrtc HomePage Title is :-  "+TsrtcPageTitle);
 // to get tsrtc page url
   String TsrtcPageUrl = driver.getCurrentUrl();
   System.out.println("Tsrtc HomePage Url is :-  "+TsrtcPageUrl);
 
 // goto "Bus on Contract" page   
   //<span class="bg-primary text-white">Bus on Contract (Easy to HIRE Bus)</span>
   
   Thread.sleep(5000);
   By    BusOnContractProperty = By.partialLinkText("Bus on Contract");
       WebElement  BusOnContract = driver.findElement(BusOnContractProperty);  
       	BusOnContract.click();
 // Identify the common property of the elements
    //anchortag is the common property in the inspected elements  which are of type links.   	
 
 // how many links in the Tsrtc HomePage
       	By  linkproperty = By.tagName("a");
   List<WebElement> TsrtcHomePageLinks	=	driver.findElements(linkproperty);
  int  TsrtcHomePageLinksCount=   TsrtcHomePageLinks.size();
   System.out.println(TsrtcHomePageLinksCount);
//what are the links of Tsrtc HomePage
   for(int index=0; index<TsrtcHomePageLinksCount; index++) {
 String linkName = TsrtcHomePageLinks.get(index).getText();
	   	   System.out.println(index +"     "+linkName);
	   	   System.out.println("**********************************");
	
   }
   
   

	}

}
