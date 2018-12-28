
public class Test {

	public static void main(String[] args) {
		/*Account account1 = new Account();
		
		account1.setHesapNo("123456");
		account1.setBakiye(1000.0);
		account1.setIsim("Ali Veli");
		account1.setEmail("ali.veli@gmail.com");
		account1.setTelefonNo("1234567");
		
		System.out.println("Bakiye : "+account1.getBakiye());*/
		
		//Account account1 = new Account();
		Account account2 = new Account("Ali", "ali@gmail.com", "1234567", "654321", 1000.0);
		
		account2.paraYatir(500.0);
		account2.paraCekme(250.0);
		account2.paraCekme(2000);

	}

}
