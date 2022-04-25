package ch9;

import java.util.Scanner;

public class IntegerTest0425 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input integer");
		int num = sc.nextInt();
		num = (num < 0) ? -num : num;
		System.out.println(num);
		if (num < 0) {
			System.out.println(-num);
		} else {
			System.out.println(num);
		}

	}

}
