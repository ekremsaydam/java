import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("1. vize notunuz:");
		double vize1 = scanner.nextDouble();

		System.out.print("2. vize notunuz:");
		double vize2 = scanner.nextDouble();

		System.out.print("Final Notunuz:");
		double finalnot = scanner.nextDouble();

		System.out.print("Okul ortalaman�z:");
		double okulOrtalama = scanner.nextDouble();

		double toplamNot = (vize1 * 0.3) + (vize2 * 0.3) + (finalnot * 0.4);

		if (toplamNot >= 90) {
			System.out.println("AA ald�n�z");
		} else if (toplamNot >= 80) {
			System.out.println("BB ald�n�z");
		} else if (toplamNot >= 70) {
			System.out.println("CC ald�n�z");
		} else if (toplamNot >= 65) {
			System.out.println("DC ald�n�z");
		} else if (toplamNot >= 60) {
			System.out.println("DD ald�n�z");
			if (okulOrtalama < 2.50) {
				System.out.println("DD ald�n�z ve ders ortalaman�z d���k. Dersi birdaha almay� d���nebilirsiniz.");
			}
		} else if (toplamNot >= 55) {
			System.out.println("FD ald�n�z ve kald�n�z");
		} else {
			System.out.println("FF ald�n�z ve kald�n�z.");
		}

	}

}
