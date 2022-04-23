package example_practice;

public class EPForArray0422 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		for (int m : array) {
			if (m > max) {
				max = m;
			}
		}
		System.out.println("max: " + max);
	}
}
