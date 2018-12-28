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

		String islemler = "1. Toplama\n" + "2. ��karma\n" + "3. �arpma\n" + "4. B�lme\n" + "��k�� i�in q'ya bas�n�z";

		System.out.println("************************************");
		System.out.println(islemler);
		System.out.println("************************************");

		while (true) {
			System.out.print("��lem se�iniz : ");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor.");
				break;
			} else if (islem.equals("1")) {
				System.out.print("Ka� de�er toplayacaks�n�z? (2 veya 3) :");
				int kacsayi = scanner.nextInt();

				if (kacsayi == 2) {
					System.out.print("Birinci Say� : ");
					int sayi1 = scanner.nextInt();

					System.out.print("�kinci Say� : ");
					int sayi2 = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Girilen say�lar�n toplam� : " + toplama(sayi1, sayi2));
				} else if (kacsayi == 3) {
					System.out.print("Birinci Say� : ");
					int sayi1 = scanner.nextInt();

					System.out.print("�kinci Say� : ");
					int sayi2 = scanner.nextInt();

					System.out.print("���nc� Say� : ");
					int sayi3 = scanner.nextInt();
					
					scanner.nextLine();

					System.out.println("Girilen say�lar�n toplam� : " + toplama(sayi1, sayi2, sayi3));
				} else {
					System.out.println("Bunun i�in uygun bir metod bulunmuyor.");
				}
			} else if (islem.equals("2")) {
				System.out.print("Birinci Say� : ");
				int sayi1 = scanner.nextInt();

				System.out.print("�kinci Say� : ");
				int sayi2 = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Girilen say�lar�n fark� : " + cikarma(sayi1, sayi2));
			} else if( islem.equals("3")) {
				System.out.print("Ka� de�er �arpacaks�n�z? (2 veya 3) :");
				int kacsayi = scanner.nextInt();

				if (kacsayi == 2) {
					System.out.print("Birinci Say� : ");
					int sayi1 = scanner.nextInt();

					System.out.print("�kinci Say� : ");
					int sayi2 = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Girilen say�lar�n �arp�m� : " + carpma(sayi1, sayi2));
				} else if (kacsayi == 3) {
					System.out.print("Birinci Say� : ");
					int sayi1 = scanner.nextInt();

					System.out.print("�kinci Say� : ");
					int sayi2 = scanner.nextInt();

					System.out.print("���nc� Say� : ");
					int sayi3 = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Girilen say�lar�n �arp�m� : " + carpma(sayi1, sayi2,sayi3));
				} else {
					System.out.println("Bunun i�in uygun bir metod bulunmuyor.");
				}
			} else if(islem.equals("4")) {
				System.out.print("Birinci Say� : ");
				int sayi1 = scanner.nextInt();

				System.out.print("�kinci Say� : ");
				int sayi2 = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Girilen say�lar�n fark� : " + bolme(sayi1, sayi2));
			} else {
				System.out.println("Yanl�� bir se�im yapt�n�z.");
			}
		}

	}

}
