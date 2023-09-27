package lava.ConditionalStatements;

public class Else_If_Condition {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		int c=30;
/*  Else_If =>Syntax=====>
 * 		 if (condition)		{		//condition is true statement exists otherwise goto else
 * 			Statements 		}
 * 			else 
 * 				If(condition)	{//condition is true statement exists otherwise goto else
 * 				Statements 		}
 * 		else{
 * 			Statements		}		*/	
	if(a>b) {
		System.out.println("in the given condition a>b is true");
		}
		else	
			if  (b>c)	{
		System.out.println("in the given condition a>b is true");	
				}
	else {
		System.out.println("c is greaterthan a&b");
	}
	}

}
