package lava.WorldClock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CapturingCompleteWebtableData  extends BaseTest{
@Test(priority=1, description ="getting complete webtable data from application")
	public void CapturingCompleteWebtabledata() {
//First row of first cell --> Full X-path
// 	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
//Last row of last cell -->Full X-path
//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
	
  String XpathExpression1 = "/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
  String XpathExpression2 ="]/td[";
  String XpathExpression3 = "]";
  //going to every Row of the webtable.
  for (int rowIndex=1;  rowIndex<=36; rowIndex++) {
	  //going to a row & Internally going every RowOfCell
	  for (int rowOfCellIndex=1; rowOfCellIndex<8; rowOfCellIndex++) {
		 By WebtableDataProperty=By.xpath(XpathExpression1+rowIndex+XpathExpression2+rowOfCellIndex+XpathExpression3);
	WebElement	  WebTableData = driver.findElement(WebtableDataProperty); 
	String	  WebtableRowOfCellData=WebTableData.getText();
	System.out.print(WebtableRowOfCellData +"   ");
	  }
	  System.out.println();
  }
  
}

	
	
}
