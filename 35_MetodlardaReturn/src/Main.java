import java.util.Scanner;

public class Main {
	
	public static int deneme(int a) {
		System.out.println("Çýktý veriliyor.");
		return a*2;
		
		System.out.println("Çýktý sonrasý iþlemler.");
		
	}

	public static int toplama(int a, int b, int c) {
		// System.out.println("toplamlarý : " + (a + b + c));

		return a + b + c;

	}

	public static int ikiilecarp(int a) {
		return a * 2;
	}

	public static int ikiiletopla(int a) {
		return a + 2;
	}

	public static int dortilecarp(int a) {
		return a * 4;
	}

	public static void main(String[] args) {
		// toplama(1, 2, 3);
		//System.out.println("toplamlarý : " + toplama(1, 2, 3));
		
		//System.out.println("Sonuc : "+dortilecarp(ikiiletopla(ikiilecarp(8))));
		System.out.println(deneme(4));
		Scanner scanner = new Scanner(System.in);
		
		scanner.close();

	}

}
