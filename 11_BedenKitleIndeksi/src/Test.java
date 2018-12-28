import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.print("Kilonuzu girin:"); int kilo = scanner.nextInt();
		 * 
		 * System.out.print("Buyunuzu girin (1,72): ");
		 * 
		 * double boy = scanner.nextDouble();
		 * 
		 * double bki = kilo / (boy * boy);
		 * 
		 * System.out.println("Beden kitle indeksiniz:" + bki);
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Kilonuzu giriniz: ");
		int kilo = scanner.nextInt();

		System.out.print("Boyunuzu giriniz :(1,72)");
		double boy = scanner.nextDouble();

		double bki = kilo / (boy * boy);

		System.out.println("Beden kitle indeksiniz =>" + bki);

	}

}
