
public class Main {

	public static void skorHesapla(String isim, int puan) {
		System.out.println(isim + " adl� oyuncunun puan� " + puan + " var.");
	}

	public static void skorHesapla(int puan) {
		System.out.println("�simsiz oyuncunun puan� " + puan + " var.");
	}

	public static void skorHesapla(String isim) {
		System.out.println(isim + " adl� oyuncunun hi� puan� yok");
	}

	public static void toplama(String a, String b) {
		System.out.println(a + " " + b);
	}

	public static void toplama(int a, int b, int c) {
		System.out.println("Toplam� : " + (a + b + c));
	}

	public static void toplama(int a, int b) {
		System.out.println("Toplam� : " + (a + b));
	}

	public static void main(String[] args) {
		/*
		 * toplama(3, 4, 5); toplama(2, 5); toplama("Ali", "Veli");
		 */
		skorHesapla("Murat", 1000);
		skorHesapla("Mehmet");
		skorHesapla(15000);
	}

}
