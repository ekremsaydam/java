package swicthCaseHesapMakinesi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String islemler = "1.Toplama Ýþlemi\n" + "2. Çýkarma Ýþlemi\n" + "3. Çarpma Ýþlemi\n" + "4. Bölme Ýþlemi\n";

		System.out.print(islemler);
		System.out.print("Ýþleminiz : ");
		String islem = scanner.nextLine();

		int a, b;

		switch (islem) {
		case "1":
			System.out.print("1. Sayi:");
			a = scanner.nextInt();
			System.out.print("2. Sayi:");
			b = scanner.nextInt();
			System.out.println("Toplam:" + (a + b));
			break;
		case "2":
			System.out.print("1. Sayi:");
			a = scanner.nextInt();
			System.out.print("2. Sayi:");
			b = scanner.nextInt();
			System.out.println("Farklarý:" + (a - b));
			break;
		case "3":
			System.out.print("1. Sayi:");
			a = scanner.nextInt();
			System.out.print("2. Sayi:");
			b = scanner.nextInt();
			System.out.println("Çarpýmlarý:" + (a * b));
			break;
		case "4":
			System.out.print("1. Sayi:");
			a = scanner.nextInt();
			System.out.print("2. Sayi:");
			b = scanner.nextInt();
			System.out.println("Bölüm:" + ((double)a / b));
			break;

		default:
			System.out.println("Bilinmeyen iþlem.");
			break;
		}
	}
}
