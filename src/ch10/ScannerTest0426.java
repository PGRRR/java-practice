package ch10;

import java.util.Scanner;

public class ScannerTest0426 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first integer");
		int a = sc.nextInt();
		System.out.println("Input second integer");
		int b = sc.nextInt();
		if (a % b == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
