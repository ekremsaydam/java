package idmanProgrami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ýdman Programýna Hoþgeldiniz.");

		String idmanlar = "Geçerli Hareketler...\nBurpes\nPushup(Þýnav)\nSitup(Mekik)\nSquat";

		System.out.println(idmanlar);
		System.out.println("Bir idman oluþturun : ");
		
		System.out.print("Burpee sayýsý : ");
		int burpee_sayisi = scanner.nextInt();
		
		System.out.print("Pushup sayýsý : ");
		int pushup_sayisi = scanner.nextInt();
		
		System.out.print("Situp sayýsý : ");
		int situp_sayisi = scanner.nextInt();
		
		System.out.print("Squat sayýsý : ");
		int squat_Sayisi = scanner.nextInt();
		scanner.nextLine();
		
		Idman idman = new Idman(burpee_sayisi, pushup_sayisi, situp_sayisi, squat_Sayisi);
		System.out.println("Idmanýnýz baþlýyor.");
		
		while(idman.idmanBittiMi() == false) {
			System.out.print("Hareket türü (burpee - pushup - situp - squat : ");
			String tur = scanner.nextLine();
			System.out.print("Bu hareketten kaç tane yapacaksýnýz : ");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			
			idman.hareketYap(tur, sayi);
			
		}
		
		System.out.println("Idmanda hedefinize ulaþtýnýz.");
		
		

	}

}
