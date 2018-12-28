import java.util.Scanner;

public class Login {
	public boolean login(Hesap hesap) {
		Scanner scanner = new Scanner(System.in);
		
		String kullanici_adi;
		String sifre;
		
		System.out.print("Kullanici ad : ");
		kullanici_adi = scanner.nextLine();
		System.out.print("Parola : ");
		sifre = scanner.nextLine();
		
		if(hesap.getKullaniciAdi().equals(kullanici_adi) && hesap.getParola().equals(sifre)) {
			return true;
		} else {
			return false;
		}
	}
}
