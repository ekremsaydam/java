package whileATMprogrami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int bakiye = 1000;
		String islemler = "1.Ýþlem : Bakiye Öðrenme\n" + "2.Ýþlem : Para Çekme\n" + "3.Ýþlem : Para Yatýrma\n"
				+ "Çýkýþ için q ya basýnýz";

		System.out.println("****************************");
		System.out.println(islemler);
		System.out.println("****************************");
		while (true) {
			System.out.print("Ýþlem seçiniz: ");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Programdan çýkýlýyor.");
				break;
			} else if (islem.equals("1")) {
				System.out.println("Bakiyeniz : " + bakiye);
			} else if (islem.equals("2")) {
				System.out.print("Çekmek istediðiniz tutar: ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				if (bakiye - tutar < 0) {
					System.out.println("Yeterli bakiye yoktur. Bakiyeniz: " + bakiye);
				} else {
					bakiye -= tutar;
					System.out.println("Yeni bakiyeniz: " + bakiye);
				}
			} else if (islem.equals("3")) {
				System.out.print("Eklemek istediðiniz tutar: ");
				int eklenecekTutar = scanner.nextInt();
				bakiye += eklenecekTutar;
				System.out.println("Yeni bakiyeniz: " + bakiye);
			}
		}
	}

}
