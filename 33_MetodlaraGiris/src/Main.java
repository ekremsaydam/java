import java.util.Scanner;

public class Main {
	public static void selamlama() {
		System.out.println("Merhba nas�ls�n�z?");
		System.out.println("Selamlar");
	}

	public static void faktoriyel() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir say� giriniz : ");
		int sayi = scanner.nextInt();

		int faktoriyel = 1;
		for (; sayi > 1; sayi--) {
			faktoriyel *= sayi;
		}
		
		System.out.println(faktoriyel);

	}

	public static void main(String[] args) {
		faktoriyel();
		faktoriyel();
	}

}
