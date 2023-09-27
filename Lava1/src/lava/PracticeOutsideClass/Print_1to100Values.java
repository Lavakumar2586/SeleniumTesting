package lava.PracticeOutsideClass;

import java.util.Scanner;

public class Print_1to100Values {

	public static void main(String[] args) {
		Scanner lava =new Scanner(System.in);
		System.out.println("please enter the Starting number :-  ");
		int Startingnumber = lava.nextInt();
		
		System.out.println("please enter the ending number:-  ");
		int endingnumber = lava.nextInt();
		
		int number = Startingnumber;
		while(number<=endingnumber) {
			System.out.println(number);
			number++;
			
		}
		
		lava.close();
	}

}
