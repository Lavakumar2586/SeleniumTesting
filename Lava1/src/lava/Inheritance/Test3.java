package lava.Inheritance;


public class Test3 extends Test2 {
//Global Variables/Instance variables
	int a=50;
	int b=15;
	
	public void addition_GlobalVariableValues() {
		//local variables
		//int a=30;
		//int b=20;
		int c;
		c=a+b;
		System.out.println("the value of c is :- "+c);
	}
//method overloading in java is a feature that allows a class to have more than one method
	//	with the same name ,but with different parameters
		
		public void addition(int a, int b) {
		//local variables
			//int a= 30;
			//int b=40;
			int c;
			c=a+b;
			System.out.println("The value of c is :- "+c);
			}
		public void addition(int a, int b, int c) {
		//local variables
			//int a= 30;
			//int b=40;
			//int c=50;
			int d;
			d=a+b+c;
			System.out.println("The value of a is :- "+a);
			System.out.println("The value of b is :- "+b);
			System.out.println("The value of c is :- "+c);
			System.out.println("The value of d is :- "+d);
		}
public void Subtraction() {		
	int c;			//Variables arranged globally will be taken under consideration
	c=a-b;
System.out.println("The value of subtraction is "+c);
}


public static void main(String[] args) {
	Test3 t3 = new Test3();
		System.out.println("***** Methods of Test3 class***********");
		t3.addition();
		t3.addition(20,30);
		t3.addition(10, 50, 70);
		t3.addition_GlobalVariableValues();
		t3.Subtraction();
		System.out.println();
		System.out.println("***********methods of Test2 class*************");
		System.out.println();
		t3.multiplication();
		t3.division();
		/* without creating object  for the test1 java class we are able to access The methods of 
		 the test1 java class with the test3 class object t3. is because Test2 class is internally 
		  extends with test1 java class */
// Directly accessing the extended java class methods
		System.out.println();
		System.out.println("*************Methods of test1 class ****************");
		System.out.println();
	}
}
