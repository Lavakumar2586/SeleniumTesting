package lava.WoldClock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReadWorldClockDiffCountryNamesInSingleColumn extends WorldClockBrowser1 {

	public void DiffCountryTimings() throws IOException {
		for (int index=1; index<36; index++) {
//**To Print 1st column coountry names**
//    /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
//    /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
	By	CountryProperty1 =By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+ index+"]/td[1]/a");
       WebElement CountryName1	=	driver.findElement(CountryProperty1);
        	String	name1 = CountryName1.getText();
//**To Print 2nd column coountry names**
//    /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[3]/a
//    /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[3]/a
    	By	CountryProperty2 =By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+ index+"]/td[3]/a");
           WebElement CountryName2	=	driver.findElement(CountryProperty2);
            	String	name2 = CountryName2.getText();
//**To Print 3rd column coountry names**
//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[5]/a
//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[5]/a
    	By	CountryProperty3 =By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+ index+"]/td[5]/a");
      	       WebElement CountryName3	=	driver.findElement(CountryProperty3);
    	    	        	String	name3 = CountryName3.getText();
//**To Print 4th column coountry names**
//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[7]/a
//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[35]/td[7]/a
  		By	CountryProperty4 =By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+ index+"]/td[7]/a");
  	       WebElement CountryName4	=	driver.findElement(CountryProperty4);
    	    	    	        	String	name4 = CountryName4.getText();
//*************************************************************        	
       System.out.println(index+"    "+name1+ "     "+name2+ "     "+name3+ "     "+name4);
		

   // The above data will be print In ExcelSheet by using Write 
       FileInputStream ExcelFile = new FileInputStream("./ExcelWorkBook/ExcelBasic1.xlsx");
       XSSFWorkbook ExcelBook = new XSSFWorkbook(ExcelFile);
       XSSFSheet WorldClockSheet = ExcelBook.getSheet("WorldClockCountryNames");
       Row createrow =WorldClockSheet.createRow(index);

       Cell createCell = createrow.createCell(0);
       createCell.setCellValue(name1);   
 
       Cell createCell1 = createrow.createCell(1);
         createCell1.setCellValue(name2);   

         Cell createCell2 = createrow.createCell(2);      
         createCell2.setCellValue(name3);   

         Cell createCell3 = createrow.createCell(3);         
         createCell3.setCellValue(name4);
      FileOutputStream  saveInExcelSheet =   new FileOutputStream("ExcelWorkBook/ExcelBasic1.xlsx");
      ExcelBook.write(saveInExcelSheet);
       }
		}
		
         	
	

	
	
	
	public static void main(String[] args) throws IOException {
		ReadWorldClockDiffCountryNamesInSingleColumn Timings = new ReadWorldClockDiffCountryNamesInSingleColumn();
		Timings.WorldClockUrl();
		Timings.DiffCountryTimings();
		Timings.WorldCloseClose();
		
	}
	
}
