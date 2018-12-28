package switchCase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��lemi giriniz:");
		int islem = scanner.nextInt();

		switch (islem) {
			case 1:
				System.out.println("1. i�lem yap�ld�");
				break;
			case 2:
				System.out.println("2. i�lem yap�ld�");
				break;
			case 3:
				System.out.println("3. i�lem yap�ld�");
				break;
			case 4:
				System.out.print("4. i�lem ap�ld�");
				break;
			default:
				System.out.println("Son i�lemim");
				break;
		}

	}

}
