import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bankam�za ho�geldiniz. Faiz Oran� &6");
		int anapara, vade;

		System.out.print("Yat�rmak istedi�iniz tutar : ");
		anapara = scanner.nextInt();
		System.out.print("Paran�z� ka� y�l vadeki yat�rmak istiyorsunuz? : ");
		vade = scanner.nextInt();

		double toplampara = anapara;
		double faizOrani = 0.06;

		for (int i = 1; i <= vade; i++) {
			toplampara += (toplampara * faizOrani);
			System.out.println(i+". y�l�n sonunda toplam para: " + (int)toplampara);
		}

	}

}
