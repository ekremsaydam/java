package whileATMprogrami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int bakiye = 1000;
		String islemler = "1.��lem : Bakiye ��renme\n" + "2.��lem : Para �ekme\n" + "3.��lem : Para Yat�rma\n"
				+ "��k�� i�in q ya bas�n�z";

		System.out.println("****************************");
		System.out.println(islemler);
		System.out.println("****************************");
		while (true) {
			System.out.print("��lem se�iniz: ");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor.");
				break;
			} else if (islem.equals("1")) {
				System.out.println("Bakiyeniz : " + bakiye);
			} else if (islem.equals("2")) {
				System.out.print("�ekmek istedi�iniz tutar: ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				if (bakiye - tutar < 0) {
					System.out.println("Yeterli bakiye yoktur. Bakiyeniz: " + bakiye);
				} else {
					bakiye -= tutar;
					System.out.println("Yeni bakiyeniz: " + bakiye);
				}
			} else if (islem.equals("3")) {
				System.out.print("Eklemek istedi�iniz tutar: ");
				int eklenecekTutar = scanner.nextInt();
				bakiye += eklenecekTutar;
				System.out.println("Yeni bakiyeniz: " + bakiye);
			}
		}
	}

}
