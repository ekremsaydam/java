import java.util.Scanner;

public class Main {
	public static int cikarma(int a, int b) {
		return (a - b);
	}

	public static double bolme(int a, int b) {
		return ((double)a / b);
	}

	public static int toplama(int a, int b) {
		return (a + b);
	}

	public static int toplama(int a, int b, int c) {
		return (a + b + c);
	}

	public static int carpma(int a, int b) {
		return (a * b);
	}

	public static int carpma(int a, int b, int c) {
		return (a * b * c);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String islemler = "1. Toplama\n" + "2. Çýkarma\n" + "3. Çarpma\n" + "4. Bölme\n" + "Çýkýþ için q'ya basýnýz";

		System.out.println("************************************");
		System.out.println(islemler);
		System.out.println("************************************");

		while (true) {
			System.out.print("Ýþlem seçiniz : ");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Programdan Çýkýlýyor.");
				break;
			} else if (islem.equals("1")) {
				System.out.print("Kaç deðer toplayacaksýnýz? (2 veya 3) :");
				int kacsayi = scanner.nextInt();

				if (kacsayi == 2) {
					System.out.print("Birinci Sayý : ");
					int sayi1 = scanner.nextInt();

					System.out.print("Ýkinci Sayý : ");
					int sayi2 = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Girilen sayýlarýn toplamý : " + toplama(sayi1, sayi2));
				} else if (kacsayi == 3) {
					System.out.print("Birinci Sayý : ");
					int sayi1 = scanner.nextInt();

					System.out.print("Ýkinci Sayý : ");
					int sayi2 = scanner.nextInt();

					System.out.print("Üçüncü Sayý : ");
					int sayi3 = scanner.nextInt();
					
					scanner.nextLine();

					System.out.println("Girilen sayýlarýn toplamý : " + toplama(sayi1, sayi2, sayi3));
				} else {
					System.out.println("Bunun için uygun bir metod bulunmuyor.");
				}
			} else if (islem.equals("2")) {
				System.out.print("Birinci Sayý : ");
				int sayi1 = scanner.nextInt();

				System.out.print("Ýkinci Sayý : ");
				int sayi2 = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Girilen sayýlarýn farký : " + cikarma(sayi1, sayi2));
			} else if( islem.equals("3")) {
				System.out.print("Kaç deðer çarpacaksýnýz? (2 veya 3) :");
				int kacsayi = scanner.nextInt();

				if (kacsayi == 2) {
					System.out.print("Birinci Sayý : ");
					int sayi1 = scanner.nextInt();

					System.out.print("Ýkinci Sayý : ");
					int sayi2 = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Girilen sayýlarýn çarpýmý : " + carpma(sayi1, sayi2));
				} else if (kacsayi == 3) {
					System.out.print("Birinci Sayý : ");
					int sayi1 = scanner.nextInt();

					System.out.print("Ýkinci Sayý : ");
					int sayi2 = scanner.nextInt();

					System.out.print("Üçüncü Sayý : ");
					int sayi3 = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Girilen sayýlarýn çarpýmý : " + carpma(sayi1, sayi2,sayi3));
				} else {
					System.out.println("Bunun için uygun bir metod bulunmuyor.");
				}
			} else if(islem.equals("4")) {
				System.out.print("Birinci Sayý : ");
				int sayi1 = scanner.nextInt();

				System.out.print("Ýkinci Sayý : ");
				int sayi2 = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Girilen sayýlarýn farký : " + bolme(sayi1, sayi2));
			} else {
				System.out.println("Yanlýþ bir seçim yaptýnýz.");
			}
		}

	}

}
