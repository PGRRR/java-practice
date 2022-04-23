package example_practice;

class Abc1 {
	int a;
}

public class EPClassInstanceVariable0422 {

	public static void main(String[] args) {
		Abc1 alpa = new Abc1();
		alpa.a = 1;
		Abc1 alpa2 = new Abc1();
		System.out.println(alpa2.a);
		alpa2.a = alpa.a;
		System.out.println(alpa2.a);
	}

}
