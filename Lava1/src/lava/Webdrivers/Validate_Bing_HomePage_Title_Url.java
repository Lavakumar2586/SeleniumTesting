package lava.Webdrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Bing_HomePage_Title_Url {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		String	bingUrl="http://bing.com";
	//	driver.get(bingUrl);
		driver.navigate().to(bingUrl);
//getting title of bing HomePage
	String	actualbinghomePageTitle =	driver.getTitle();
	System.out.println("Actual Bing Home page title is :- "+actualbinghomePageTitle);
//getting Bing website Url
	String actualBingWebsiteurl =   driver.getCurrentUrl();
	System.out.println("Actual Bing Website url is  :- " +actualBingWebsiteurl);
     String ExpectedBingHPTitle = "bing";
     System.out.println("Expected Bing HP Title is :-  "+ExpectedBingHPTitle);
  String ExpectedBingHPUrl =  "bing.com";
  System.out.println("Expected Bing HP Url is :-  "+ExpectedBingHPUrl);
  System.out.println("***************************************");
  
//verify bing HP Title is validate or not ==> title is Bing
  if 
  			//  (ExpectedBingHPTitle.equals(actualbinghomePageTitle)) {
  	(ExpectedBingHPTitle.equalsIgnoreCase(actualbinghomePageTitle)) {
	  System.out.println("bing HP title is validated successfully - pass");
  }
  else {
	  System.out.println("BingHP title is not validated - fail");
  }
System.out.println("****************************************");	

  if 
//  (ExpectedBingHPUrl.equals(actualBingWebsiteurl)) {
  (actualBingWebsiteurl.contains(ExpectedBingHPUrl)) {
	  System.out.println("bing HP Url is validated successfully - pass");
  }
  else {
	  System.out.println("Bing HP Url is not validated - fail");
  }

  
  
	driver.close();
	
	}

}
