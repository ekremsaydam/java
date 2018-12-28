package hipotenusBulma;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("1. dik kenarý giriniz:");
		int kenar1 = scanner.nextInt();

		System.out.print("2. dik kenarý giriniz:");
		int kenar2 = scanner.nextInt();

		double hipoenus = Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2));

		System.out.println("Hipotenus :" + hipoenus);

	}
}
