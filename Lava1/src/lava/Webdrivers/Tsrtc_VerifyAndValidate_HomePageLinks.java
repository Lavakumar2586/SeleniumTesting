package lava.Webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_VerifyAndValidate_HomePageLinks {

public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  	driver.manage().window().maximize();

  	String tsrtcUrl	= "https://www.tsrtc.telangana.gov.in/" ;
			driver.get(tsrtcUrl);

			Thread.sleep(5000);   
	
By  BusOncontractproperty =By.partialLinkText("Bus on Contract ");
 WebElement  BusOnContract = driver.findElement(BusOncontractproperty);
			BusOnContract.click();

By tsrtc_HeadBlockProperty = By.className("menu-wrap");  
 WebElement Tsrtc_HeadBlock = 	driver.findElement(tsrtc_HeadBlockProperty);
			
  By  tsrtc_headerBlockLinksProperty =	By.tagName("a");
  List<WebElement> Tsrtc_HeadBlockLinks =Tsrtc_HeadBlock.findElements(tsrtc_headerBlockLinksProperty);
  int Tsrtc_HeadblockLinkCount = Tsrtc_HeadBlockLinks.size();
  System.out.println("The number of links in the headerBlock is :- "+ Tsrtc_HeadblockLinkCount);
/*
 for(int index=0; index<Tsrtc_HeadblockLinkCount; index++) {
 String Tsrtc_HeaderBlockName =	Tsrtc_HeadBlockLinks.get(index).getText();
System.out.println(index+ "     "+ Tsrtc_HeaderBlockName);

	Tsrtc_HeadBlockLinks.get(index).click();    */
  
 String ExpectedTsrtcUrlForLink[] = new String[8];
ExpectedTsrtcUrlForLink[0]= "https://tsrc/home/";
ExpectedTsrtcUrlForLink[1]= "https://tsrc/BusOnContract/";
ExpectedTsrtcUrlForLink[2]= "https://tsrc/enquiry/";
ExpectedTsrtcUrlForLink[3]= "https://tsrc/CancelTickets/";
ExpectedTsrtcUrlForLink[4]= "https://tsrc/Cancelled Services/";
ExpectedTsrtcUrlForLink[5]= "https://tsrc/About Us/";
ExpectedTsrtcUrlForLink[6]= "https://tsrc/Tourism/";
ExpectedTsrtcUrlForLink[7]= "https://tsrc/Driver Info/";
 System.out.println( );
 for (int index1=0; index1<8;index1++) {
	 System.out.println(ExpectedTsrtcUrlForLink[index1]);
//	 String	actual_Tsrttc_webPageTitle = driver.getTitle();
//	  System.out.println("The title of current WebPage is :- "+actual_Tsrttc_webPageTitle);

	  String actualTsrtc_WebpageUrl =	driver.getCurrentUrl();
	  System.out.println("The actual Tsrtc Webpage Url is :-  "+actualTsrtc_WebpageUrl); 	
 
	  for(int index=0; index<Tsrtc_HeadblockLinkCount; index++) {
		  String Tsrtc_HeaderBlockName =	Tsrtc_HeadBlockLinks.get(index).getText();
		 System.out.println(index+ "     "+ Tsrtc_HeaderBlockName);

		 	Tsrtc_HeadBlockLinks.get(index).click();    
	  
if(actualTsrtc_WebpageUrl.equalsIgnoreCase(actualTsrtc_WebpageUrl)) {
 System.out.println(Tsrtc_HeaderBlockName+ "  :=> The validation Url of currentpage is successfull  -Pass");
 	} 
 else { 
System.out.println("The validation Url of currentpage is not successfull"+Tsrtc_HeaderBlockName +"Fail");
 }
String actualTsrtc_WebpageUrl1 =	driver.getCurrentUrl();
System.out.println("The actual Tsrtc Webpage Url is :-  "+actualTsrtc_WebpageUrl1); 	

System.out.println(); 	
 
 
 driver.navigate().back();
Tsrtc_HeadBlock = 	driver.findElement(tsrtc_HeadBlockProperty);
Tsrtc_HeadBlockLinks =Tsrtc_HeadBlock.findElements(tsrtc_headerBlockLinksProperty);

	  }
  
  break;
  
 }  }
		
}
