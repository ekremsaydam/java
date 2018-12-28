import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bankamýza hoþgeldiniz. Faiz Oraný &6");
		int anapara, vade;

		System.out.print("Yatýrmak istediðiniz tutar : ");
		anapara = scanner.nextInt();
		System.out.print("Paranýzý kaç yýl vadeki yatýrmak istiyorsunuz? : ");
		vade = scanner.nextInt();

		double toplampara = anapara;
		double faizOrani = 0.06;

		for (int i = 1; i <= vade; i++) {
			toplampara += (toplampara * faizOrani);
			System.out.println(i+". yýlýn sonunda toplam para: " + (int)toplampara);
		}

	}

}
