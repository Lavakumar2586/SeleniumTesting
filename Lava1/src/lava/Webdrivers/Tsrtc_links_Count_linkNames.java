package lava.Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_links_Count_linkNames {
	public static void main (String[] s) throws Throwable {
		
System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
       String TsrtcUrl	=	"https://www.tsrtc.telangana.gov.in";
       System.out.println(TsrtcUrl);

//     driver.get(TsrtcUrl);
      driver.navigate().to(TsrtcUrl);
//to get Title & Url Of current webpage 

	String	TitleOfpage=driver.getTitle();
    String	UrlOfPage =driver.getCurrentUrl();
    System.out.println(TitleOfpage);
	System.out.println(UrlOfPage);
	Thread.sleep(5000);
	
//	<b>TSRTC Package Tours </b>	
//<a href="https://www.tsrtconline.in/oprs-web/services/packagetours.do" 
	//target="_blank"><b>TSRTC Package Tours </b> </a>	
	
	driver.findElement(By.partialLinkText("><b>TSRTC Package Tours ")).click();
	
	
	}

}
