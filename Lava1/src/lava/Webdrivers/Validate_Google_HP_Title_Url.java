package lava.Webdrivers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Google_HP_Title_Url {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
   ChromeDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
  
   String GoogleWebsite="https://google.com";
  driver.get(GoogleWebsite);

  //The Actual title and Url home page of Google is  :-  
   String ActualGoogleHPTitle = driver.getTitle();
   System.out.println("actual google home page title is :- "+ActualGoogleHPTitle);
 
   String  actualGoogleWebsiteURL = driver.getCurrentUrl();
  System.out.println("actual google HomePage URL Is :-  "+actualGoogleWebsiteURL);
  
  //The expected title and Url of google homepage is :-
  		String  ExpectedgoogleHpTitle="google";
  System.out.println("the expected google homePage Title is :-   "+ExpectedgoogleHpTitle);
  
  		String ExpectedGoogleHpUrl="google.com";
  System.out.println("The expected Google HomePage Url is :-    "+ExpectedGoogleHpUrl);
  System.out.println("*************************");
  System.out.println("==> validation of title & Url of google is :-  ");
  
  //Validate Title
  if (ExpectedgoogleHpTitle.equalsIgnoreCase(ActualGoogleHPTitle)) {
	  System.out.println("the title of google HP is validated successfully : Pass");
	    }
  else {
	  System.out.println("the title of google hp is not validate :- fail");
  }
  
  //Validate Url
  if (actualGoogleWebsiteURL.contains(ExpectedGoogleHpUrl)) {
	  System.out.println("the Url of google HP is validated successfully : Pass");
	    }
  else {
	  System.out.println("the Url of google hp is not validate :- fail");
  }
  
  
}
}
