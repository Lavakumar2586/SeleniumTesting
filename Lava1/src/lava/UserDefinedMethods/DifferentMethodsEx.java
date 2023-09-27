package lava.UserDefinedMethods;

public class DifferentMethodsEx {

	protected void addition() {
		
		int a=10;
		int b=20;
		int c;
		c=a+b;
		System.out.println("The value of c after addition is :-  "+ c); 
		
	}
	public void Subtraction() {
		int a=20;
		int b=35;
		int c;
		c=a-b;
		System.out.println("The value of c  after subtraction is :- "+c);
	}
	private void Multiplication() {
		int a =30;
		int b=25;
		int c;
		c=a*b;
		System.out.println("the value of c after multiplication is :-   "+c);
		}
	void defaultClass() {
		int a=29;
		int b=30;
		int c= a+b;
		System.out.println("The value of default class c is :-  "+c);
	}
	
	public static void main(String[] args) {
		DifferentMethodsEx m1= new DifferentMethodsEx();
		m1.addition();
		m1.Subtraction();
		m1.Multiplication();
		m1.defaultClass();
		m1.division();
		m1.Overload(109, 458);
			}

public void division() {
try {
	
	
	int a=10;
	int b=0;
	int c=a/b;
	System.out.println("the value of C after divisible by zero is :- "+ c);
	}
catch (Exception divisible)
	{
	System.out.println(divisible);
}

}
//Method Overloading 
public void Overload(int a, int b) {
int	c=a+b;
	System.out.println("The Overloading value of after doing operation is :- "+c);
	
}
	
	
}
