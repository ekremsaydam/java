import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/*
		 * System.out.print("Lütfen yaþýnýzý giriniz:");
		 * 
		 * int yas = scanner.nextInt(); if(yas < 18) {
		 * System.out.println("Bu mekana giremezsiniz..."); }
		 */

		System.out.print("Lütfen bir sayý giriniz:");
		int sayi = scanner.nextInt();

		if (sayi < 0) {
			System.out.println("Megatif");
		} else {
			System.out.println("Pozitif veya 0");
		}

		

	}

}
