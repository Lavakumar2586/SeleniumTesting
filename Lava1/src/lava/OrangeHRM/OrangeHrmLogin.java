package lava.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrmLogin extends OrangeHrmUrl {

	public void Login() {
// id="txtUsername" 
		By UsernameProperty = By.id("txtUsername");
	WebElement Username =	driver.findElement(UsernameProperty);
		Username.clear();
		Username.sendKeys("Lavakumar");
// name="txtPassword" 
	By	PasswordProperty = By.name("txtPassword");
	WebElement Password =	driver.findElement(PasswordProperty);
	Password.clear();
	Password.sendKeys("Omvinayaka1@");
// class="button" 	
	By	LoginBtnProperty = By.className("button");
   WebElement LoginBtn = 	driver.findElement(LoginBtnProperty);
   LoginBtn.click();
   	}
	
	public void AddEmpLink() {
// id="menu_pim_viewPimModule" 
By	PIMProperty = By.id("menu_pim_viewPimModule");
WebElement	PimMouseHover = driver.findElement(PIMProperty);
Actions actions =new Actions(driver);
actions.moveToElement(PimMouseHover).build().perform();
// id="menu_pim_addEmployee"
  By AddEmpProperty = By.id("menu_pim_addEmployee");
WebElement AddEmpLink = driver.findElement(AddEmpProperty);
AddEmpLink.click();
	}
	
}





