package ch5;

import java.util.Scanner;

public class ArrTest1_0413 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		int num = sc.nextInt();
		if (num >= 1) {
			for (int i = 0; i < num; i++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
}