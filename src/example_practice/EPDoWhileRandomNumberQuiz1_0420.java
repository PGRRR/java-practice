package example_practice;

import java.util.Scanner;

public class EPDoWhileRandomNumberQuiz1_0420 {

	public static void main(String[] args) {
		int answer = 0;
		int input = 0;
		Scanner sc = new Scanner(System.in);
		answer = (int)(Math.random()*100) + 1;
		do {
			System.out.println("Input 1 ~ 100 number >");
			input = sc.nextInt();
			if (input < answer) {
				System.out.println("Bigger");
			} else if (input > answer) {
				System.out.println("Smaller");
			}
		} while (input != answer);
		System.out.println("Correct!");
	}

}
