package ch11;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a");
		int a = sc.nextInt();
		System.out.println("Input b");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("a is bigger");
		} else if (a < b) {
			System.out.println("b is bigger");
		} else {
			System.out.println("a equals b");
		}
	}
}
