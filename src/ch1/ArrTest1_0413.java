package ch1;

import java.util.Scanner;

public class ArrTest1_0413 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int num = sc.nextInt();
		if (num >= 1) {
			for (int i = 0; i < num; i++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
}