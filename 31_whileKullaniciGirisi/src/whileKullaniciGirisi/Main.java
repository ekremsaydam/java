package whileKullaniciGirisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int girisHakki = 3;

		String sys_kullanici_adi = "admin";
		String sys_parola = "1234";

		System.out.println("*******************************");
		System.out.println("Kullan�c� giri�ine ho�geldiniz.");
		System.out.println("*******************************");

		while (true) {
			System.out.print("Kullan�c� ad�: ");
			String kullanici = scanner.nextLine();

			System.out.print("Parola: ");
			String parola = scanner.nextLine();

			if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
				System.out.println("Ho�geldiniz " + kullanici);
				break;
			} else if(kullanici.equals(sys_kullanici_adi) && !(parola.equals(sys_parola))) {
				System.out.println("Parolan�z Yanl��");
				girisHakki--;
			} else if(!(kullanici.equals(sys_kullanici_adi)) && parola.equals(sys_parola)) {
				System.out.println("Kullan�c� ad�n�z Yanl��");
				girisHakki--;
			}  else {
				System.out.println("Kullan�c� ad� ve parolan�z yanl��");
				girisHakki--;
			}
			
			if(girisHakki == 0) {
				System.out.println("Giri� hakk�n�z bitti. Program sonland�r�l�yor.");
				break;
			}
		}
	}

}
