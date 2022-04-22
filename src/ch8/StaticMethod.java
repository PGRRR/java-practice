package ch8;

public class StaticMethod {
	static int a;
	int b;

	static void test(int x) {
		int sum = 0;
		// sum = a + b + x; // b is iv error in static method
		StaticMethod sm = new StaticMethod();
		sum = a + sm.b + x;
		sum = a + x;
		System.out.println("sum = " + sum);
		// test2(); // instance method error int static method
		test3(); // pass static method in static method
	}

	void test2() {
		System.out.println("test2");
	}

	static void test3() {
		System.out.println("test3");
	}
}
