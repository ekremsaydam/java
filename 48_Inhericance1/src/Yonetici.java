
public class Yonetici extends Calisan { // subclass
	private int sorumlu_kisi; // ekstra özellik

	public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
		super(isim, maas, departman);
		this.sorumlu_kisi = sorumlu_kisi;
	}

	public void zamYap(int zam_miktari) {
		System.out.println("Çalýþanlara " + zam_miktari + "TL zam yapýldý.");
	}

	@Override
	public void bilgileriGoster() {
		/*System.out.println("Ýsim : " + super.getIsim());
		System.out.println("Maas : " + super.getMaas());
		System.out.println("Depatman : " + super.getDepartman());*/
		super.bilgileriGoster();
		System.out.println("Sorumlu Kiþi : " + this.sorumlu_kisi);
	}

}
