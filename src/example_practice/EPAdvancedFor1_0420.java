package example_practice;

import java.util.Arrays;

public class EPAdvancedFor1_0420 {

	public static void main(String[] args) {
		int [] arrs = {10, 5, 4, 3, 7, 50};
		int sum = 0;
		Arrays.sort(arrs);
		System.out.println(Arrays.toString(arrs));
		for (int arr : arrs) {
			sum += arr;
		}
		System.out.printf("sum = %d%n", sum);
		double avg = (double)sum / arrs.length;
		System.out.printf("avg = %.1f%n", avg);
	}

}
