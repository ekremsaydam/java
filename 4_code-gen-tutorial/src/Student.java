
public class Student {
	private static final int DONGU_SAYISI = 4;
	private String lastName;
	private String firstName;
	private int age;

	public Student(String lastName, String firstName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("Hellow World");

		for (String temp : args) {
			System.out.println(temp);
			for (int i = 0; i < DONGU_SAYISI; i++) {
				
			}
		}
	}

}
