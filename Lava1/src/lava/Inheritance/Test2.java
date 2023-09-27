package lava.Inheritance;

public class Test2  extends Test1{
//Inheritance uses Extends Keyword
	protected void multiplication() {
		int a= 30;
		int b=40;
		int c;
		c=a*b;
		System.out.println("the value of c is :- "+c);
			}
	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.multiplication();
		t2.division();
		/* Test1  t1 = new Test1();
		      t1.addition();	  */
	//without creating an object for test1 java class- Directly using test2 class 
		// Objects calling the methods of the Test1 class
		t2.addition();
		
	}
	void division() {		//default method
		try {				// Exception handling   try....catch
			int a=30;
			int b=0;
			int c;
			c=a/b;
			System.out.println("The value of c is :- "+c);
		}
		catch(Exception errormessage){
			System.out.println("The exception is :- "+errormessage);
			System.out.println("Unable to perform the operation Division");
			
		}
	}	
	}
	

