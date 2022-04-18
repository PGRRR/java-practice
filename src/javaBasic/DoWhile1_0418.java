package javaBasic;

import java.util.Scanner;

public class DoWhile1_0418 {

	public static void main(String[] args) {
		int input = 0, answer = 0;

		answer = (int)(Math.random() * 100) + 1;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Input 1~100 integer >");
			input = sc.nextInt();

			if(input > answer) {
				System.out.println("Again - smaller");
			} else if (input < answer) {
				System.out.println("Again - bigger");
			}
		} while(input != answer);
		System.out.println("Correct");
	}

}
