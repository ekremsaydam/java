package swicthCaseHesapMakinesi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String islemler = "1.Toplama ��lemi\n" + "2. ��karma ��lemi\n" + "3. �arpma ��lemi\n" + "4. B�lme ��lemi\n";

		System.out.print(islemler);
		System.out.print("��leminiz : ");
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
			System.out.println("Farklar�:" + (a - b));
			break;
		case "3":
			System.out.print("1. Sayi:");
			a = scanner.nextInt();
			System.out.print("2. Sayi:");
			b = scanner.nextInt();
			System.out.println("�arp�mlar�:" + (a * b));
			break;
		case "4":
			System.out.print("1. Sayi:");
			a = scanner.nextInt();
			System.out.print("2. Sayi:");
			b = scanner.nextInt();
			System.out.println("B�l�m:" + ((double)a / b));
			break;

		default:
			System.out.println("Bilinmeyen i�lem.");
			break;
		}
	}
}
