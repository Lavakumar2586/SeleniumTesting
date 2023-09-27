package lava.Webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_Display_Elements_OnBusOnContract {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  	driver.manage().window().maximize();
 
  	// 	driver.get("https://www.tsrtc.telangana.gov.in/");
 
  	String tsrtcUrl	= "https://www.tsrtc.telangana.gov.in/" ;
  			driver.get(tsrtcUrl);

	//<span class="bg-primary text-white">Bus on Contract (Easy to HIRE Bus)</span>

  /*
	 * String TsrtcTitle = driver.getTitle(); String TsrtcUrl =
	 * driver.getCurrentUrl();
	 * System.out.println("The title of Tsrtc Homepage is :- "+ TsrtcTitle);
	 * System.out.println("The url of Tsrtc Homepage is :- "+ TsrtcUrl);
	 */
 // links of the Tsrtc Bus on contract page is --->>>
	// first we will verify all the links what are the common property in this page.
	/*	
	<a class="tabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
	<a class="selectedtabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" 
	<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
	*/	
Thread.sleep(5000);   

//driver.findElement(By.partialLinkText("Bus on Contract ")).click();
	
By   BusOncontractproperty =By.partialLinkText("Bus on Contract ");
WebElement  BusOnContract = driver.findElement(BusOncontractproperty);
BusOnContract.click();
  
//How many links in Tsrtc BusOnContract page,to find with the help of linkProperty as anchortag 'a'
/*
  By TsrtclinkProperty = By.tagName("a"); 
  List<WebElement>TsrtcBusOnContractLinks= driver.findElements(TsrtclinkProperty); 
  int  TsrtcBusOnContractLinksCount = TsrtcBusOnContractLinks.size(); 
  System.out.println("The number of links in the TsrtcBusOnContract page is :- "+
  										TsrtcBusOnContractLinksCount);
 */
// what are the links of Tsrtc BusOnContract page is :-
/*
 for(int index=0; index<TsrtcBusOnContractLinksCount; index++)  {
  String TsrtcLinkName = TsrtcBusOnContractLinks.get(index).getText();
 		System.out.println(index + "   "+ TsrtcLinkName);
  		}
 */ 
//Tsrtc BusOnContract links will be check one by one
   // first we will identify the header block property
 //<div class="menu-wrap">
   //class is the property of the head block.
By tsrtc_HeadBlockProperty = By.className("menu-wrap");  
 WebElement Tsrtc_HeadBlock = 	driver.findElement(tsrtc_HeadBlockProperty);
	/*		
	<a class="tabcopy" href="/oprs-web/guest/home.do?h=1"
	 target="_top" title="Home">Home</a>
	 
	 <a class="selectedtabcopy blinking" 
	 href="/oprs-web/guest/specialHire.do" target="_top" 
	 title="Bus on Contract">Bus on Contract</a>
	 
	 <a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top"
	  title="Enquiry">Enquiry</a>
	*/	
//we will  find majority of the links having anchor tag property.
 
 	  By  tsrtc_headerBlockLinksProperty =	By.tagName("a");
//just check automatically Enquiry element in the head block	
 	  	//Tsrtc_HeadBlock.findElement(By.linkText("Enquiry")).click();
 //find all elements in the head block
 
 	  
 List<WebElement> Tsrtc_HeadBlockLinks =Tsrtc_HeadBlock.findElements(tsrtc_headerBlockLinksProperty);
 int Tsrtc_HeadblockLinkCount = Tsrtc_HeadBlockLinks.size();
 System.out.println("The number of links in the headerBlock is :- "+ Tsrtc_HeadblockLinkCount);
 	  	//for getting the names of the links of header block is :- 
 
 for(int index=0; index<Tsrtc_HeadblockLinkCount; index++) {
 	 String Tsrtc_HeaderBlockName =	Tsrtc_HeadBlockLinks.get(index).getText();
 	System.out.println(index+ "     "+ Tsrtc_HeaderBlockName);
 
 //to click all the links in the Tsrtc head block	  	
 	  	Tsrtc_HeadBlockLinks.get(index).click();
 //when click operation is performeed the driver focus will be moved to next page
   String	actual_Tsrttc_webPageTitle = driver.getTitle();
 System.out.println("The title of current WebPage is :- "+actual_Tsrttc_webPageTitle);
 	String actualTsrtc_WebpageUrl =	driver.getCurrentUrl();
  System.out.println("The actual Tsrtc Webpage Url is :-  "+actualTsrtc_WebpageUrl); 	
 	 System.out.println(); 	
 	 
 	 driver.navigate().back();
 	Tsrtc_HeadBlock = 	driver.findElement(tsrtc_HeadBlockProperty);
 	Tsrtc_HeadBlockLinks =Tsrtc_HeadBlock.findElements(tsrtc_headerBlockLinksProperty);

 //Verify And Validate of the Tsrtc HeadBlock page url of every links
 	
 	//this is in another programme
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	  	}	
	}
}
