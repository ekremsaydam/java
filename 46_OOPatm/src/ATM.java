import java.util.Scanner;

public class ATM {
	public void calis(Hesap hesap) {
		Login login = new Login();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bankamýza hoþgeldiniz.");
		System.out.println("***********************");
		System.out.println("Kullanýcý giriþi");
		System.out.println("***********************");

		int girisHakki = 3;

		while (true) {
			if (login.login(hesap)) {
				System.out.println("Giriþ baþarýlý");
				break;
			} else {
				System.out.println("Giriþ baþarýsýz.");
				girisHakki -= 1;
				System.out.println("Kalan giriþ hakký : " + girisHakki);
			}
			
			if(girisHakki == 0 ) {
				System.out.println("Giriþ hakkýnýz bitti.");
				return;
			}
		}
		
		System.out.println("******************************");
		String islemler = "1. Bakiye Görüntüle\n"
						+ "2. Para Yatýrma\n"
						+ "3. Para Çekme\n"
						+ "Çýkýþ için q'ya basýnýz";
		
		
		
		while(true) {
			System.out.println(islemler);
			System.out.print("Ýþlemi Seçiniz : ");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				break;
			} else if(islem.equals("1")) {
				System.out.println("Bakiyeniz : "+hesap.getBakiye());
			} else if(islem.equals("2")) {
				System.out.print("Yatýrmak istediðiniz tutar : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				
				hesap.paraYatir(tutar);
				
			} else if(islem.equals("3")) {
				System.out.print("Çekmek istediðiniz tutar : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				
				hesap.paraCek(tutar);
			} else {
				System.out.println("Geçersiz iþlem");
			}
		}

	}
}
