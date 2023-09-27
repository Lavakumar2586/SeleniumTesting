package lava.Arrays;

public class MultiDimensionalArrayEx2 {
	public static void main(String[] args) {
	String lava[][] =new String[2][2];
	lava[0][0] = "Lava";    int a = 10; 
	lava[0][1] = "Kumar";
	lava[1][0] = "Ramesh";
	lava[1][1] = "yadav";

	for(int rowIndex=0;rowIndex<2;rowIndex++) {
		for(int rowOfCellIndex=0;rowOfCellIndex<2;rowOfCellIndex++) {
	//		System.out.print(lava[rowIndex][rowOfCellIndex] +"   "+a +"     ");
		System.out.print(lava[rowIndex][rowOfCellIndex]+"  ");
		}
		System.out.println("**********************");
	}
	
	}

}
