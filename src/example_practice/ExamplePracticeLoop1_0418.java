package example_practice;

import java.util.Scanner;

public class ExamplePracticeLoop1_0418 {

	public static void main(String[] args) {
		// 입력한 값의 개수만큼 '*'를 표시하는 프로그램을 작성하자.
		// 마지막에는 줄 바꿈 문자를 출력할 것.
		// 단, 읽은 값이 1미만이면 줄 바꿈 문자를 표시해서는 안 된다.
		Scanner sc = new Scanner(System.in);
		System.out.println("input number");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		if (num > 0) {
			System.out.println();
			}
	}
}
