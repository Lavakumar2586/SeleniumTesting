package lava.testNGBasic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestAnnotations {

	@BeforeTest
	public void gmailApplicationLaunch()
	{
	System.out.println(" *********  Gmail Application Launch Successfull *********** ");
	}

	@AfterTest
	public void gmailApplicationClose()
	{
	System.out.println(" ********* Gmail Application Closed Successfully *************");
	}

	@Test(priority=2,description="Gmail InBox Functionality Test")
	public void inBoxTest()
	{
	System.out.println(" ******** Gmail Application InBox Functionality Test Successfull ***********");
	}

	@Test(priority=3,description="Gmail composeMail Functionality Test")
	public void composeMailTest()
	{
	System.out.println(" ********** Gmail Application ComposeMail Functionality Test Successfull ***********");
	}

	@Test(priority=1,description="Gmail LogIn Functionality Test")
	public void LogInTest()
	{
	System.out.println(" ********** Gmail Application LogIn Functionality Test Successfull ********");
	}


	@Test(enabled=false,description="Gmail Drafts Functionality Test") // This Test case is a False Test case - TestNG Ignores the current
	                    //     Test case during the Test Run
	                    //   The default Status of the Test Case is - enabled=true
	public void DraftsTest()
	{
	System.out.println(" ********** Gmail Application Drafts Functionality Test Successfull ********");
	}

	@Test(priority=4,description="Gmail SentMail Functionality Test")
	public void SentMailTest()
	{
	System.out.println(" ********** Gmail Application SentMail Functionality Test Successfull ********");
	}
		

}
