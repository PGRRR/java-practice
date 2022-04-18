package example_practice;

import java.util.Scanner;

public class ExamplePracticeConditional1_0418 {

	public static void main(String[] args) {
		// 정숫값을 읽어 부호(양수/음수/0)를 판정하는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);
		System.out.println("input int");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("plus");
		} else if (num < 0) {
			System.out.println("minus");
		} else {
			System.out.println("0");
		}

	}

}
