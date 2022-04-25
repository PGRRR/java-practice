package ch9;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();
		m.print();
		m.setMemberData("me", "000-0000-0000", "LA");
		m.print();

	}

}
