package lava.Arrays;

public class MultiDimensionalArrayEx1 {
	public static void main(String[] args) {
		String lava[][] = new String[2][2];
		lava[0][0] = "Telangana";
		lava[0][1] = "Hyderabad";
		lava[1][0] = "andhra";
		lava[1][1] = "Vizag";
//		System.out.println(lava[1][1]);
	for (int rowIndex=0;rowIndex<2;rowIndex++) {
		for (int rowOfCellIndex=0;  rowOfCellIndex<2; rowOfCellIndex++ ) {
		System.out.println(lava[rowIndex][rowOfCellIndex]+ "      ");
					}
		System.out.println();
			}	
	System.out.println("**************************");

	for (int a=0;a<2;a++) {
		for (int b=0;  b<2; b++ ) {
		System.out.println(lava[a][b]+ "      ");
					}
		System.out.println();
			}	
	System.out.println("**************************");
// we can give System.out.print => then the result will be	
	for (int rowIndex=0;rowIndex<2;rowIndex++) {
		for (int rowOfCellIndex=0;  rowOfCellIndex<2; rowOfCellIndex++ ) {
		System.out.print(lava[rowIndex][rowOfCellIndex]+ "      ");
					}
		System.out.println();
			}	
	System.out.println("**************************");
	for (int a=0;a<2;a++) {
		for (int b=0;  b<2; b++ ) {
		System.out.print(lava[a][b]+ "      ");
					}
		System.out.println();
			}	
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
// for applying the length ==>>
String	lava1[][] = new String[2][2];
		lava1[0][0] = "lava";
		lava1[0][1] = "Ramesh";
		lava1[1][0] = "LAVA";
		lava1[1][1] = "RAMESH";
		for (int rowIndex=0; rowIndex<2;rowIndex++) {
			for(int rowOfCellIndex=0; rowOfCellIndex<2; rowOfCellIndex++) {
				System.out.print(lava1[rowIndex][rowOfCellIndex] +    "       ");			
			}	
			System.out.println();
		}
	
	}

}
