import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.print("Lütfen yaþýnýzý giriniz: ");
		// int yas = scanner.nextInt();
//		double yas = scanner.nextDouble();
//
//		System.out.println("Yaþýnýz -> " + yas);
		/*
		 * System.out.println("ütfen Bir cümle giriniz : "); String yazi =
		 * scanner.nextLine();
		 * 
		 * System.out.println(yazi);
		 * 
		 * 
		 */
		System.out.println("Lütfen bir say giriniz:");
		if (scanner.hasNextInt()) {
			int sayi = scanner.nextInt();
			System.out.println("Sayi : " + sayi);
		} else {
			System.out.println("Lütfen bir SAYI giriniz.");
		}

		

	}

}
