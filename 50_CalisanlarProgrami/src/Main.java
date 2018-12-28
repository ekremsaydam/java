import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�a��an Program�na Ho�geldiniz...");
		String islemler = "��lemler...\n1. Yaz�l�mc� ��lemleri\n2. Y�netici ��lemleri\n��k�� i�in q'ya bas�n�z";
		System.out.println("*********************************");
		System.out.println(islemler);
		System.out.println("*********************************");

		while (true) {
			System.out.print("��lem se�iniz : ");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			} else if (islem.equals("1")) {
				Yazilimci yazilimci = new Yazilimci("Murat", "Mustafa", 567, "Python, C, Java");
				String yazilimciIslem = "1. Format At\n2. Bilgileri G�ster\n��k�� i�in q'ya bas�n�z.";
				System.out.println(yazilimciIslem);
				while (true) {
					System.out.print("��lem say�s� : ");
					String y_islem = scanner.nextLine();

					if (y_islem.equals("q")) {
						System.out.println("Yaz�l�mc� i�lemlerinden ��k�l�yor.");
						break;
					} else if (y_islem.equals("1")) {
						System.out.print("��letim sistemi : ");
						String isletim_sistemi = scanner.nextLine();
						yazilimci.formatAt(isletim_sistemi);
					} else if (y_islem.equals("2")) {
						yazilimci.bilgileriGoster();
					} else {
						System.out.println("Ge�ersiz Yaz�l�mc� ��lemi...");
					}
				}
			} else if (islem.equals("2")) {
				Yonetici yonetici = new Yonetici("Serhat", "Say", 123, 10);
				String yoneticiIslem = "Y�netici ��lemleri\n1. Zam Yap\n2. Bilgileri G�ster\n��k�� i�in q'ya bas�n�z.";
				System.out.println(yoneticiIslem);

				while (true) {
					System.out.print("Y�netici i�lem se�iniz : ");
					String y_islem = scanner.nextLine();

					if (y_islem.equals("q")) {
						System.out.println("Y�netici i�lemlerinden ��k�l�yor.");
						break;
					} else if(y_islem.equals("1")) {
						System.out.print("Y�neticinin ne kadar zam yapmas�n� istiyorsunuz : ");
						int zamMiktari = scanner.nextInt();
						scanner.nextLine();

						yonetici.zamYap(zamMiktari);
					} else if(y_islem.equals("2")) {
						yonetici.bilgileriGoster();
					} else {
						System.out.println("Ge�ersiz Y�netici ��lemi...");
					}
				}
			} else {
				System.out.println("Ge�ersiz i�lem...");
			}

		}

	}

}
