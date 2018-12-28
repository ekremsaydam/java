package whileKullaniciGirisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int girisHakki = 3;

		String sys_kullanici_adi = "admin";
		String sys_parola = "1234";

		System.out.println("*******************************");
		System.out.println("Kullanýcý giriþine hoþgeldiniz.");
		System.out.println("*******************************");

		while (true) {
			System.out.print("Kullanýcý adý: ");
			String kullanici = scanner.nextLine();

			System.out.print("Parola: ");
			String parola = scanner.nextLine();

			if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
				System.out.println("Hoþgeldiniz " + kullanici);
				break;
			} else if(kullanici.equals(sys_kullanici_adi) && !(parola.equals(sys_parola))) {
				System.out.println("Parolanýz Yanlýþ");
				girisHakki--;
			} else if(!(kullanici.equals(sys_kullanici_adi)) && parola.equals(sys_parola)) {
				System.out.println("Kullanýcý adýnýz Yanlýþ");
				girisHakki--;
			}  else {
				System.out.println("Kullanýcý adý ve parolanýz yanlýþ");
				girisHakki--;
			}
			
			if(girisHakki == 0) {
				System.out.println("Giriþ hakkýnýz bitti. Program sonlandýrýlýyor.");
				break;
			}
		}
	}

}
