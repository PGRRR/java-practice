package ch4;

public class ForMultiplicationTableExample0413 {

	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "dan ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println((m + " x " + n + " = " + (m*n)));
			}
			System.out.println();
		}
	}
}
