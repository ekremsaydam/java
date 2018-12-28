
public class Calisan {
	private String ad;
	private String Soyad;
	private int id;

	public Calisan(String ad, String soyad, int id) {
		super();
		this.ad = ad;
		this.Soyad = soyad;
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return Soyad;
	}

	public void setSoyad(String soyad) {
		Soyad = soyad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void bilgileriGoster() {
		System.out.println("Çalýþan Bilgileri");
		System.out.println("Ad : " + ad);
		System.out.println("Soyad : " + Soyad);
		System.out.println("Id : " + id);
	}
}
