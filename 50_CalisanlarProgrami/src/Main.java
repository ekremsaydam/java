import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Çaýþan Programýna Hoþgeldiniz...");
		String islemler = "Ýþlemler...\n1. Yazýlýmcý Ýþlemleri\n2. Yönetici Ýþlemleri\nçýkýþ için q'ya basýnýz";
		System.out.println("*********************************");
		System.out.println(islemler);
		System.out.println("*********************************");

		while (true) {
			System.out.print("Ýþlem seçiniz : ");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Programdan çýkýlýyor...");
				break;
			} else if (islem.equals("1")) {
				Yazilimci yazilimci = new Yazilimci("Murat", "Mustafa", 567, "Python, C, Java");
				String yazilimciIslem = "1. Format At\n2. Bilgileri Göster\nçýkýþ için q'ya basýnýz.";
				System.out.println(yazilimciIslem);
				while (true) {
					System.out.print("Ýþlem sayýsý : ");
					String y_islem = scanner.nextLine();

					if (y_islem.equals("q")) {
						System.out.println("Yazýlýmcý iþlemlerinden Çýkýlýyor.");
						break;
					} else if (y_islem.equals("1")) {
						System.out.print("Ýþletim sistemi : ");
						String isletim_sistemi = scanner.nextLine();
						yazilimci.formatAt(isletim_sistemi);
					} else if (y_islem.equals("2")) {
						yazilimci.bilgileriGoster();
					} else {
						System.out.println("Geçersiz Yazýlýmcý Ýþlemi...");
					}
				}
			} else if (islem.equals("2")) {
				Yonetici yonetici = new Yonetici("Serhat", "Say", 123, 10);
				String yoneticiIslem = "Yönetici Ýþlemleri\n1. Zam Yap\n2. Bilgileri Göster\nçýkýþ için q'ya basýnýz.";
				System.out.println(yoneticiIslem);

				while (true) {
					System.out.print("Yönetici iþlem seçiniz : ");
					String y_islem = scanner.nextLine();

					if (y_islem.equals("q")) {
						System.out.println("Yönetici iþlemlerinden çýkýlýyor.");
						break;
					} else if(y_islem.equals("1")) {
						System.out.print("Yöneticinin ne kadar zam yapmasýný istiyorsunuz : ");
						int zamMiktari = scanner.nextInt();
						scanner.nextLine();

						yonetici.zamYap(zamMiktari);
					} else if(y_islem.equals("2")) {
						yonetici.bilgileriGoster();
					} else {
						System.out.println("Geçersiz Yönetici Ýþlemi...");
					}
				}
			} else {
				System.out.println("Geçersiz iþlem...");
			}

		}

	}

}
