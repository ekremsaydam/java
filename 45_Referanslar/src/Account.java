
public class Account {
	private String hesapNo;
	private double bakiye;
	private String isim;
	private String email;
	private String telefonNo;
	
	public Account() {
		// System.out.println("Kendi yazdýðýmýz constructor");
		/*this.isim = "Bilgi yok";
		this.email= "Bilgi yok";
		this.telefonNo = "Bilgi yok";
		this.hesapNo = "Bilgi yok";
		this.bakiye = 0.0;*/
		this("Bilgi yok", "Bilgi yok", "Bilgi yok","Bilgi yok", 0.0);
		System.out.println("Kendi yazdýðýmýz constructor");
	}
	
	public Account(String isim, String email, String telefonNo) {
		/*this.isim = isim;
		this.email = email;
		this.telefonNo = telefonNo;
		
		this.bakiye = 0.0;
		this.hesapNo = "Bilgi yok";*/
		
		this(isim,email,telefonNo,"Bilgi yok",0.0);
		
	}
	
	public void bilgileriGoster() {
		System.out.println("Hesap Numarasý : "+this.hesapNo);
		System.out.println("Bakiye : "+this.bakiye);
		System.out.println("Ýsim : "+this.isim);
		System.out.println("email : "+email);
		System.out.println("Telefon No : "+this.telefonNo);
	}

	
	public Account(String isim, String email, String telefonNo, String hesapNo, double bakiye) {
		this.isim = isim;
		this.email= email;
		this.telefonNo = telefonNo;
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
	}
	

	public void paraYatir(double miktar) {
		this.bakiye += miktar;
		System.out.println("Yeni bakiye : " + this.bakiye);
	}

	public void paraCekme(double miktar) {
		if (miktar > 1500) {
			System.out.println("Bir günde 1500TL den fazla çekemezsiniz.");
		}

		if (bakiye - miktar < 0) {
			System.out.println("Yeterli bakiyeniz yoktur. Bakiyeniz : " + bakiye);
		} else {
			this.bakiye -= miktar;

			System.out.println("Yeni bakiye = " + bakiye);
		}
	}

	public String getHesapNo() {
		return hesapNo;
	}

	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonNo() {
		return telefonNo;
	}

	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}

}
