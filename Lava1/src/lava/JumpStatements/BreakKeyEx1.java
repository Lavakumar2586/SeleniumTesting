package lava.JumpStatements;

public class BreakKeyEx1 {
public static void main(String[] args) {
	for (int a=1; a<5; a++) {
		System.out.println(a+"   "+ "Lava");
		if (a==3) {
			System.out.println(a+"     "+"Kumar");
			break;
		}
		System.out.println("*******************");

		System.out.println(a+"   "+"Lava Kumar");
	}
}
}
