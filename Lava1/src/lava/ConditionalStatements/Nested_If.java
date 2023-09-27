package lava.ConditionalStatements;

public class Nested_If {
public static void main(String[] args) {
	/*	Nested_If ==>==> "if" Condition Contains "if" Condition	// it doesn't have else
	 * Syntax:-  if(Condition){
	 * 			   Statements
	 * 				if(Condition){
	 * 				  Statements
	 * 					}
	 * 				} 
			*/
	int a=50;  int b=60; int c=50;
	if(a<b) {
		System.out.println("a is lessthan b => the statement is true");
		if (a==c) {
			System.out.println("a is equalto c");
				}
			}
	
	System.out.println("This is Lava kumar");
			}
}
