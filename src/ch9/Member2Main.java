package ch9;

public class Member2Main {

	public static void main(String[] args) {
		Member2 m1 = new Member2();
		m1.print();
		Member2 m2 = new Member2("IU");
		m2.print();
		Member2 m3 = new Member2("KIM", "000-0000-0000", "KOREA");
		m3.print();
		m1.name = "TEST";
		m1.tel = "123";
		m1.print();
	}

}
