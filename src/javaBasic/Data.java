package javaBasic;

public class Data {
	int x;
}

class Ex6_6 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.printf("main() : x = %d", d.x);

		change(d.x);
		System.out.println("After change(d.x)");
		System.out.printf("main() : x = %d", d.x);

	}

	static void change(int x) { // basic parameter
		x = 1000;
		System.out.printf("change() : x = %d", x);
	}
}
