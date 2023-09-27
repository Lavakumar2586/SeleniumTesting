package lava.Loops;

public class ForLoopExample1 {
	public static void main(String[] args) {

	/*	for Loop =>> Syntax:- for(inita)
	 * for(Initialization; Condition; Increment/Decrement){
	 *     //Statements					
	 * 			}		*/
		
		String lava ="Selenium";
		for (int a=1; a<3; a++) {
			System.out.println(a);
			System.out.println(lava);
			System.out.println(a + "    "+   lava);
			System.out.println("***********************");
		}
//*************************************************************
			String lava1 ="Webdriver";
			for (int a=-1; a<=10; a=a+2) {
				System.out.println(a);
				System.out.println(lava1);
				System.out.println(a + "    "+   lava1);
				System.out.println("***********************");
		}
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&		
		
		String b="RAMESH";
		for(int a = 3; a<15; a=a+3) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(a + "    "+   b);
			System.out.println("***********************");
		}
	//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
			String c = "Lava";
			for(int a=-3; a<19; a=a+3) {
				System.out.println(c);
				System.out.println(a);
				System.out.println(c + "    "+   a);
				System.out.println("***********************");
			
		}
		
	}

}
