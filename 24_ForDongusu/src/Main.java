import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * int i; for (i = 0; i < 5; i++) { System.out.println("i = " + i); }
		 */

		/*
		 * for (int i = 0; i < 5; i++) { System.out.println("i=" + i); }
		 */

		/*
		 * for (int i = 10; i >= 0; i--) { System.out.println("i=" + i); }
		 */

		/*
		 * int i = 0; for (; i < 5; i++) { System.out.println("i=" + i); }
		 */

		/*
		 * int i = 0; int j = 10;
		 * 
		 * for (; i < 10 && j > 0; i++, j--) { System.out.println("i=" + i);
		 * System.out.println("j=" + j); }
		 */

		/*
		 * for (int i = 2; i < 100; i *= 2) { System.out.println("i=" + i); }
		 */

		// 5! = 5*4*3*2*1

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir say� giriniz: ");
		int sayi = scanner.nextInt();
		int faktoriyel = 1;

		for (int i = 1; i <= sayi; i++) {
			faktoriyel *= i;
			System.out.println("Fakt�riyel = " + faktoriyel + " i=" + i);
		}

		System.out.println(sayi + "! sonucu: " + faktoriyel);
	}

}