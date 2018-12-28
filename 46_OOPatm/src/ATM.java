import java.util.Scanner;

public class ATM {
	public void calis(Hesap hesap) {
		Login login = new Login();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bankam�za ho�geldiniz.");
		System.out.println("***********************");
		System.out.println("Kullan�c� giri�i");
		System.out.println("***********************");

		int girisHakki = 3;

		while (true) {
			if (login.login(hesap)) {
				System.out.println("Giri� ba�ar�l�");
				break;
			} else {
				System.out.println("Giri� ba�ar�s�z.");
				girisHakki -= 1;
				System.out.println("Kalan giri� hakk� : " + girisHakki);
			}
			
			if(girisHakki == 0 ) {
				System.out.println("Giri� hakk�n�z bitti.");
				return;
			}
		}
		
		System.out.println("******************************");
		String islemler = "1. Bakiye G�r�nt�le\n"
						+ "2. Para Yat�rma\n"
						+ "3. Para �ekme\n"
						+ "��k�� i�in q'ya bas�n�z";
		
		
		
		while(true) {
			System.out.println(islemler);
			System.out.print("��lemi Se�iniz : ");
			String islem = scanner.nextLine();
			
			if(islem.equals("q")) {
				break;
			} else if(islem.equals("1")) {
				System.out.println("Bakiyeniz : "+hesap.getBakiye());
			} else if(islem.equals("2")) {
				System.out.print("Yat�rmak istedi�iniz tutar : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				
				hesap.paraYatir(tutar);
				
			} else if(islem.equals("3")) {
				System.out.print("�ekmek istedi�iniz tutar : ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				
				hesap.paraCek(tutar);
			} else {
				System.out.println("Ge�ersiz i�lem");
			}
		}

	}
}
