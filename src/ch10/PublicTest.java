package ch10;

public class PublicTest {
	public int x;
	private int y; // access in class

	public PublicTest(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		setValue(); // private member call
		System.out.println("x = " + x + ", y = " + y);
	}

	private void setValue() {
		x = 100;
		y = 100;
	}
}
