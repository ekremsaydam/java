package idmanProgrami;

public class Idman {
	private int burpea_sayisi;
	private int pushup_sayisi;
	private int situp_Sayisi;
	private int squat_sayisi;

	public Idman(int burpea_sayisi, int pushup_sayisi, int situp_Sayisi, int squat_sayisi) {
		super();
		this.burpea_sayisi = burpea_sayisi;
		this.pushup_sayisi = pushup_sayisi;
		this.situp_Sayisi = situp_Sayisi;
		this.squat_sayisi = squat_sayisi;
	}

	public int getBurpea_sayisi() {
		return burpea_sayisi;
	}

	public void setBurpea_sayisi(int burpea_sayisi) {
		this.burpea_sayisi = burpea_sayisi;
	}

	public int getPushup_sayisi() {
		return pushup_sayisi;
	}

	public void setPushup_sayisi(int pushup_sayisi) {
		this.pushup_sayisi = pushup_sayisi;
	}

	public int getSitup_Sayisi() {
		return situp_Sayisi;
	}

	public void setSitup_Sayisi(int situp_Sayisi) {
		this.situp_Sayisi = situp_Sayisi;
	}

	public int getSquat_sayisi() {
		return squat_sayisi;
	}

	public void setSquat_sayisi(int squat_sayisi) {
		this.squat_sayisi = squat_sayisi;
	}

	public void hareketYap(String hareketTuru, int sayi) {
		if (hareketTuru.equals("burpee")) {
			burbesYap(sayi);
		} else if (hareketTuru.equals("pushup")) {
			pushupYap(sayi);
		} else if (hareketTuru.equals("situp")) {
			sithupYap(sayi);
		} else if (hareketTuru.equals("squat")) {
			squatYap(sayi);
		} else {
			System.out.println("Geçersiz hareket");
		}
	}

	public void burbesYap(int sayi) {
		if (burpea_sayisi == 0) {
			System.out.println("Yapacak burpes kalmadý...");
		}

		if (burpea_sayisi - sayi < 0) {
			System.out.println("Hedeflediðin Burpee sayýsýný geçtin. Tebrikler.");
			burpea_sayisi = 0;
			System.out.println("Kalan Burpee sayýsý : " + burpea_sayisi);
		} else {
			burpea_sayisi -= sayi;
			System.out.println("Kalan burpee sayýsý : " + burpea_sayisi);
		}
	}

	public void pushupYap(int sayi) {
		if (pushup_sayisi == 0) {
			System.out.println("Yapacak pushup kalmadý...");
		}

		if (pushup_sayisi - sayi < 0) {
			System.out.println("Hedeflediðin pushup sayýsýný geçtin. Tebrikler.");
			pushup_sayisi = 0;
			System.out.println("Kalan pushup sayýsý : " + pushup_sayisi);
		} else {
			pushup_sayisi -= sayi;
			System.out.println("Kalan sithup sayýsý : " + pushup_sayisi);
		}
	}
	
	public void sithupYap(int sayi) {
		if (situp_Sayisi == 0) {
			System.out.println("Yapacak sithup kalmadý...");
		}

		if (situp_Sayisi - sayi < 0) {
			System.out.println("Hedeflediðin sithup sayýsýný geçtin. Tebrikler.");
			situp_Sayisi = 0;
			System.out.println("Kalan sithup sayýsý : " + situp_Sayisi);
		} else {
			situp_Sayisi -= sayi;
			System.out.println("Kalan sithup sayýsý : " + situp_Sayisi);
		}
	}

	public void squatYap(int sayi) {
		if (squat_sayisi == 0) {
			System.out.println("Yapacak squat kalmadý...");
		}

		if (squat_sayisi - sayi < 0) {
			System.out.println("Hedeflediðin squat sayýsýný geçtin. Tebrikler.");
			squat_sayisi = 0;
			System.out.println("Kalan squat sayýsý : " + squat_sayisi);
		} else {
			squat_sayisi -= sayi;
			System.out.println("Kalan squat sayýsý : " + squat_sayisi);
		}
	}

	public boolean idmanBittiMi() {
		return (burpea_sayisi == 0) && (pushup_sayisi == 0) && (situp_Sayisi == 0) && (squat_sayisi == 0);
	}

}
