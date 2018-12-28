
public class Main {

	public static void skorHesapla(String isim, int puan) {
		System.out.println(isim + " adlý oyuncunun puaný " + puan + " var.");
	}

	public static void skorHesapla(int puan) {
		System.out.println("Ýsimsiz oyuncunun puaný " + puan + " var.");
	}

	public static void skorHesapla(String isim) {
		System.out.println(isim + " adlý oyuncunun hiç puaný yok");
	}

	public static void toplama(String a, String b) {
		System.out.println(a + " " + b);
	}

	public static void toplama(int a, int b, int c) {
		System.out.println("Toplamý : " + (a + b + c));
	}

	public static void toplama(int a, int b) {
		System.out.println("Toplamý : " + (a + b));
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
