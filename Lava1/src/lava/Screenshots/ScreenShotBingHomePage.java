package lava.Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotBingHomePage extends BingBrowserInteraction {

public void Capturingscreenshots() throws IOException  {
//takes Screenshot -> is an interface in selenium Webdriver
	//driver ->is an object of the class
//when an interface is binded with an object of a class it is called as typecasting
	//output type is an interface

	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotFile , new File("F:\\Selenium Workspace\\Lava1\\Screenshots\\scrreen.png"));
//	File screenchot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

//	FileUtils.copyFile(screenchot, new File("F:\\Selenium Workspace\\Lava1\\Screenshots\\scrreen.png")); // to save the file
	}
		
public static void main(String[] args) throws IOException  {
	ScreenShotBingHomePage screenshot = new ScreenShotBingHomePage();
		screenshot.applicationlaunch();
		screenshot.Capturingscreenshots();
	//	screenshot.applicationclose();
		
	}
}

	
	
	
	
	
	
	


