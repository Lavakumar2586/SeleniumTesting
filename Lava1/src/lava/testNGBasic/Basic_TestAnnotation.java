package lava.testNGBasic;

import org.testng.annotations.Test;

public class Basic_TestAnnotation {
@Test
	public void gmailPage() {
		System.out.println("***The gmail page Opens Successfully***");
	}
@Test
public void loginPage() {
	System.out.println("***The login page Opens Successfully***");
}
@Test
public void inboxpage() {
	System.out.println("***The inbox page Opens Successfully***");
}
@Test
public void composemail() {
	System.out.println("***The compose mail Opens Successfully***");
}
@Test
public void Sentmail() {
	System.out.println("***The Sent mail Opens Successfully***");
}	
@Test
public void syso() {
System.out.println("*******************************");
}
}


/*
=>@Test -> It represents to a Testcase
=>Any functionality which is under test should be always be written using TestNG
=>Annotation @Test => The user defined name which is implemented with @Test is referred to as a TestCaseName
=> If a class coontains many testcases --> The test case always exists based on the Alphabetical Order -->
Starting with UpperCase letter and will follow then the LowerCase Letter of the given TestCase Name
*/

