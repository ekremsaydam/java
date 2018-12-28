
public class Calisan { // superclass yada baseclass deniyor.
	private String isim;
	private int maas;
	private String departman;

	public Calisan(String isim, int maas, String departman) {
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;
	}

	public void calis() {
		System.out.println("Çalýþan Çalýþýyor...");
	}

	public void bilgileriGoster() {
		System.out.println("Ýsim : " + isim);
		System.out.println("Maas : " + maas);
		System.out.println("Depatman : " + departman);
	}

	public void departmanDegistir(String yeni_departman) {
		System.out.println("Depatman deðiþtiriliyor.");
		this.departman = yeni_departman;

		System.out.println("Yeni Depatman " + this.departman);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}
	
	
}
