package ch10;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		m.setName("kim");
		m.setTel("1234");
		m.setAddress("Seoul"); // call setter - value init

		String name = m.getName();
		String tel = m.getTel();
		String address = m.getAddress(); // call getter - value read

		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}

}
