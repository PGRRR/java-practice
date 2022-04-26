package ch10;

public class PublicTestMain {

	public static void main(String[] args) {
		PublicTest pt = new PublicTest(10, 10);
		pt.x = 20; // public - access conform
//		pt.y = 20; private - access denied
//		pt.setValue(); private - access denied
		pt.print(); // public - access conform

	}

}
