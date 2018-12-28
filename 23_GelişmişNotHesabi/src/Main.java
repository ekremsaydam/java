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

		System.out.print("Okul ortalamanýz:");
		double okulOrtalama = scanner.nextDouble();

		double toplamNot = (vize1 * 0.3) + (vize2 * 0.3) + (finalnot * 0.4);

		if (toplamNot >= 90) {
			System.out.println("AA aldýnýz");
		} else if (toplamNot >= 80) {
			System.out.println("BB aldýnýz");
		} else if (toplamNot >= 70) {
			System.out.println("CC aldýnýz");
		} else if (toplamNot >= 65) {
			System.out.println("DC aldýnýz");
		} else if (toplamNot >= 60) {
			System.out.println("DD aldýnýz");
			if (okulOrtalama < 2.50) {
				System.out.println("DD aldýnýz ve ders ortalamanýz düþük. Dersi birdaha almayý düþünebilirsiniz.");
			}
		} else if (toplamNot >= 55) {
			System.out.println("FD aldýnýz ve kaldýnýz");
		} else {
			System.out.println("FF aldýnýz ve kaldýnýz.");
		}

	}

}
