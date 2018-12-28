import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int birinciSayi;
		int ikinciSayi;

		System.out.print("1.Sayýyý giriniz: ");
		birinciSayi = scanner.nextInt();

		System.out.print("2. Sayýyý giriniz: ");
		ikinciSayi = scanner.nextInt();
		
		System.out.println("1.Sayý:"+birinciSayi+" 2.Sayi:"+ikinciSayi);

		int gecici = birinciSayi;

		birinciSayi = ikinciSayi;

		ikinciSayi = gecici;
		
		System.out.println("Deðiþtirildikten sonra 1.Sayý:"+birinciSayi+" 2.Sayi:"+ikinciSayi);

	}

}
