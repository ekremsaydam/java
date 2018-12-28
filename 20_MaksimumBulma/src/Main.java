import java.util.Scanner;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("1. sayýyý giriniz:");
		int sayi1 = scanner.nextInt();

		System.out.print("2. sayýyý giriniz:");
		int sayi2 = scanner.nextInt();

		System.out.print("3. sayýyý giriniz:");
		int sayi3 = scanner.nextInt();

		int maks = -1;

		if (sayi1 >= sayi2 && sayi1 >= sayi3) {
			maks = sayi1;
		} else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
			maks = sayi2;
		} else {
			maks = sayi3;
		}

		System.out.println("Maksimum sayý : " + maks);

	}

}
