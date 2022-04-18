package example_practice;

import java.util.Scanner;

public class ExamplePracticeDoWhile1_0418 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String");
		System.out.println("Press q exit");
		
		String inputString;
		do {
			inputString = sc.nextLine();
			System.out.println(">");
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		System.out.println("Program end");

	}

}
