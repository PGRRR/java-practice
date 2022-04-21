package example_practice;

public class EAMethodClass0421 {
	int abc(String a, String b) {
		String result = a + b;
		int result2 = Integer.parseInt(result);
		return result2;
	}
	public static void main(String[] args) {
		EAMethodClass0421 printHi = new EAMethodClass0421();
		System.out.println(printHi.abc("1","2"));

	}

}
