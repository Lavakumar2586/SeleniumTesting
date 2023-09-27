package lava.Arrays;

public class SingleDimensionalArrayEx1 {
	
	public static void main(String[] args) {
		/*
		 * Single Dimensional Array 
		 * Syntax:-     dataType arrayName[] =new  dataType[size];
		 */	
		
		int lava[] = new int [4];
		 lava[0]=10;
		 lava[1]=20;
		 lava[2]=30;
		 lava[3]=40;
	//we can give extra even one argument also it stops the operation
 // inthis we can give size as 4 but we given 5 then it stops => outofbound Exception 
//		 lava[4]=50;
		System.out.println(lava[0]);
		System.out.println(lava[1]);
		System.out.println(lava[2]);
		System.out.println(lava[3]);
		System.out.println("****************************");
	for (int index=0; index<4; index++) {
//		System.out.println(lava[index]);
		System.out.print(lava[index]+   "       ");
		
		
	}	
		
		
	}

}
