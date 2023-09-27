package lava.WoldClock;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PrintAllTheCountrynamesInRowsAndColumns extends WorldClockBrowser1 {
public void ReadAllCountryNames() {
    for (int index=1; index<=36; index++) {
    	
By	CountryProperty =By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+ index+"]/td[1]/a");
  WebElement CountryName	=	driver.findElement(CountryProperty);
   	String	name = CountryName.getText();
   		
   	
//		/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[3]/a
//		/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[3]/a
System.out.println(index+ "    "+name);
    	}
   }


public static void main(String[] args) {
	PrintAllTheCountrynamesInRowsAndColumns AllNames = new PrintAllTheCountrynamesInRowsAndColumns();
	AllNames.WorldClockUrl();
	AllNames.ReadAllCountryNames();
	AllNames.WorldCloseClose();
}
}
