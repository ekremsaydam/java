import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.print("L�tfen ya��n�z� giriniz: ");
		// int yas = scanner.nextInt();
//		double yas = scanner.nextDouble();
//
//		System.out.println("Ya��n�z -> " + yas);
		/*
		 * System.out.println("�tfen Bir c�mle giriniz : "); String yazi =
		 * scanner.nextLine();
		 * 
		 * System.out.println(yazi);
		 * 
		 * 
		 */
		System.out.println("L�tfen bir say giriniz:");
		if (scanner.hasNextInt()) {
			int sayi = scanner.nextInt();
			System.out.println("Sayi : " + sayi);
		} else {
			System.out.println("L�tfen bir SAYI giriniz.");
		}

		

	}

}
