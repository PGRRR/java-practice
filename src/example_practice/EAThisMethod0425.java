package example_practice;

public class EAThisMethod0425 {

	public static void main(String[] args) {
		Diss ds = new Diss();
		ds.print();

	}

}

class Diss {
	int a;
	int b;
	int c;

	Diss() {
		this(10);
		System.out.println(1);
	}

	Diss(int a) {
		this(20, 30);
		System.out.println(2);
	}

	Diss(int a, int b) {
		this(40, 50, 60);
		System.out.println(3);
	}

	Diss(int a, int b, int c) {
		System.out.println(4);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
