package ch9;

public class KoreanConstructorInit0425 {

	public static void main(String[] args) {
		Korean k1 = new Korean("PJava", "1234", "Japan");
		System.out.println("k1.nation : " + k1.nation);
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		System.out.println();
		
		Korean k2 = new Korean("KJava", "5678", "Korea");
		System.out.println("k1.nation : " + k2.nation);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		System.out.println();
	}

}
