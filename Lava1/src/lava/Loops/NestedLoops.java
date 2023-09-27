package lava.Loops;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class NestedLoops {

	public static void main(String[] args) {
//Syntax of Nested loops is 

/*   for(initialization; condition; Increment/Decrement) {
     ==> True
     for(initialization; condition; increment/decrement){
			STATEMENT/ STATEMENT
		      }
		  }		 */
		
/*
 * for(int a=10; a<15; a++) { for(int b=5 ; b<10; b++) {
 * System.out.println("a value is :- "+a+"      "+"b value is :-  "+b); } }
 */
		
		for( int rowIndex=1; rowIndex<= 10; rowIndex++) {
	//		Row TestDataSheet_Row = WorkBookSheet.getRow(rowIndex);
		//	int	TestdataSheet_RowOfCellCount	= TestDataSheet_Row.getLastCellNum();
			//System.out.println("The number of columns in the Rrow Of Cell Is :- "+ TestdataSheet_RowOfCellCount );
			System.out.println(rowIndex);
		for(int CellIndex1 =1; CellIndex1<=5;CellIndex1++) {
		//	Cell rowOfCell = TestDataSheet_Row.getCell(CellIndex1);
			//String	TestData	=	rowOfCell.getStringCellValue();
				System.out.println( CellIndex1);
					}
		System.out.println(   );
		
		}
	
	}

}
