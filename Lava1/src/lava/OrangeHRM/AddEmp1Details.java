package lava.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmp1Details extends OrangeHrmLogin {
	public void Emp1Details() {
//name="firstName" id="firstName">		
			By   FirstNameProperty = By.id("firstName");
		WebElement	FirstNameTab=driver.findElement(FirstNameProperty);
		FirstNameTab.clear();
		FirstNameTab.sendKeys("Lava");
// name="lastName" id="lastName">
		By	LastNameProperty=By.name("lastName");
		WebElement	lastNameTab=driver.findElement(LastNameProperty);
		lastNameTab.sendKeys("Kumar");
// id="btnSave"
		   By	SaveBtnProperty=By.id("btnSave");
		  WebElement SaveBtn = driver.findElement(SaveBtnProperty);
		  SaveBtn.click();
//<input type="button" id="btnSave" value="Edit" class="">
		By SaveBtnproperty = By.id("btnSave");
	WebElement	SaveButton =  driver.findElement(SaveBtnproperty);
	SaveButton.click();

	By SaveBtnproperty1 = By.id("btnSave");
WebElement	SaveButton1 =  driver.findElement(SaveBtnproperty1);
SaveButton1.click();

	}
	

}
