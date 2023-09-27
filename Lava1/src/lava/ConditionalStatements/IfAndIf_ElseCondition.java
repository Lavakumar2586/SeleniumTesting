package lava.ConditionalStatements;

public class IfAndIf_ElseCondition {

	public static void main(String[] args) {

		int a=10;
		int b=20;

/*		give the condition in If block, if it is TRUE only the Statement exists otherwise not exists.
		 * Syntax:- if(Condition) {
		 *  Statements
		 *  }         */
	System.out.println("If Condition => follows Syso");	
		if (a<b) {
			System.out.println("b is greaterrthan a - the condition is true");
					}
//After	If block we can give any statement in syso this will exists.
		System.out.println("a greaterthan b - the condition is false");;
System.out.println("****************If Else********************");

if (a>b) {
	System.out.println("b is greaterrthan a - the condition is true");
			}
else {
	System.out.println("a greaterthan b - the condition is false");;

}
	
	}

}
