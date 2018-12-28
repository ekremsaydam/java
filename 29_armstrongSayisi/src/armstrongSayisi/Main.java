package armstrongSayisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir say� giriniz: ");
		int sayi = scanner.nextInt();

		System.out.print("Basamak say�s�: ");
		int basamakSayisi = scanner.nextInt();

		int gecisiSayi = sayi;
		int toplam = 0;
		do {
			int basamakDegeri = gecisiSayi % 10;
			gecisiSayi /= 10;
			toplam += Math.pow(basamakDegeri, basamakSayisi);
		} while (gecisiSayi > 0);

		if (toplam == sayi) {
			System.out.println(sayi + " bir Amstrong say�s�d�r.");
		} else {
			System.out.println(sayi + " bir Amstrong say�d� DE��LD�R.");
		}
	}

}
