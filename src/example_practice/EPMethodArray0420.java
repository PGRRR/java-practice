package example_practice;

import java.util.Arrays;

public class EPMethodArray0420 {
	static int [] add (int a, int b) {
		int [] result = {a, b};
		return result;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(add(1, 2)));

	}
}
