package lava.testNGBasic;

import org.testng.annotations.Test;

public class Basic_TestAnnotationWithParameters {
@Test(priority=1,description="Gmail Application Launch")
public void a() {
		System.out.println("***The gmail page Opens Successfully***");
	}
@Test(priority=2,description="login Application Launch")
public void b() {
	System.out.println("***The login page Opens Successfully***");
}
@Test(priority=4,description="inbox Application Launch")
public void c() {
	System.out.println("***The inbox page Opens Successfully***");
}
@Test(priority=3,description="Compose mail Successfully")
public void d() {
	System.out.println("***The compose mail Opens Successfully***");
}
@Test(priority=5,description="sent mail Successfully")
public void e() {
	System.out.println("***The Sent mail Opens Successfully***");
}	
@Test
public void f() {
System.out.println("*******************************");
}

	
}
