package lava.UserDefinedMethods;

public class MethodEx2 {
	
	public void addition() {
		int a= 10;
		int b=20;
		int c;
		c=a+b;
		System.out.println("The value of variable C after addition is :-  "+c); 
			}
	public static void main(String[] args) {
		System.out.println("the main method starts ");
		//Syntax is :-    Classname Object = new Classname();
		MethodEx2 m2 = new MethodEx2();
		m2.addition();
		m2.Subtraction();
// by using class name we will call it from Anywhere		
	MethodEx1 m1 = new MethodEx1();
	m1.method1();
	m1.method2();
	m1.method3();
	m1.method2();
		
	}
	private void Subtraction() {
		int a=20;
		int b=10;
		int c;
		c=a-b;
		System.out.println("the value of c after Subtraction is :- "+c);
	}
	
	}


