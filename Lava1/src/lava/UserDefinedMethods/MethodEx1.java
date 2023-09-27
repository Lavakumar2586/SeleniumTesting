package lava.UserDefinedMethods;

public class MethodEx1 {

public void method1()			
{								
System.out.println("Testing");	
}							
public void method2() {		
	System.out.println("Webdriver");
}
public static void main(String[] args) {
	
	System.out.println("This is Lava Kumar");
	MethodEx1 m1 = new MethodEx1();
			m1.method1();
			m1.method2();
			m1.method3();
			m1.method1();
			m1.method3();
			m1.method2();
			m1.method1();
	MethodEx2 m2 = new MethodEx2();
	m2.addition();
//	m2.Subtraction(); we can't call private methods from another class 
	
				
		}
			public void method3() {
				System.out.println("Selenium");
				}}
//********************************************
//User Defined Method
//User Defined method names should be Unique(not repeats).
//UserDefined methods are created for Reusability purpose
//a call can have any number of user defined methods without main method
//userdefined methods will not run by itself
//********user Defined methods can be created either above the main of below the main method
// To perform the operations related to user defined methods we should create an object for the current 
			//class in the main method
//*********Main methodd  is the location from which the programme Execution starts
//using the object created for the current class we should be calling the user defined methods
//user defined methods can be called from the main method for any number of times





