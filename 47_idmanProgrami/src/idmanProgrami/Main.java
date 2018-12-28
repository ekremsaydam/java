package idmanProgrami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�dman Program�na Ho�geldiniz.");

		String idmanlar = "Ge�erli Hareketler...\nBurpes\nPushup(��nav)\nSitup(Mekik)\nSquat";

		System.out.println(idmanlar);
		System.out.println("Bir idman olu�turun : ");
		
		System.out.print("Burpee say�s� : ");
		int burpee_sayisi = scanner.nextInt();
		
		System.out.print("Pushup say�s� : ");
		int pushup_sayisi = scanner.nextInt();
		
		System.out.print("Situp say�s� : ");
		int situp_sayisi = scanner.nextInt();
		
		System.out.print("Squat say�s� : ");
		int squat_Sayisi = scanner.nextInt();
		scanner.nextLine();
		
		Idman idman = new Idman(burpee_sayisi, pushup_sayisi, situp_sayisi, squat_Sayisi);
		System.out.println("Idman�n�z ba�l�yor.");
		
		while(idman.idmanBittiMi() == false) {
			System.out.print("Hareket t�r� (burpee - pushup - situp - squat : ");
			String tur = scanner.nextLine();
			System.out.print("Bu hareketten ka� tane yapacaks�n�z : ");
			int sayi = scanner.nextInt();
			scanner.nextLine();
			
			idman.hareketYap(tur, sayi);
			
		}
		
		System.out.println("Idmanda hedefinize ula�t�n�z.");
		
		

	}

}
