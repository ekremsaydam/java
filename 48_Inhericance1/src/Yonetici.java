
public class Yonetici extends Calisan { // subclass
	private int sorumlu_kisi; // ekstra �zellik

	public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
		super(isim, maas, departman);
		this.sorumlu_kisi = sorumlu_kisi;
	}

	public void zamYap(int zam_miktari) {
		System.out.println("�al��anlara " + zam_miktari + "TL zam yap�ld�.");
	}

	@Override
	public void bilgileriGoster() {
		/*System.out.println("�sim : " + super.getIsim());
		System.out.println("Maas : " + super.getMaas());
		System.out.println("Depatman : " + super.getDepartman());*/
		super.bilgileriGoster();
		System.out.println("Sorumlu Ki�i : " + this.sorumlu_kisi);
	}

}
