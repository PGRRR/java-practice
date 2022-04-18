package example_practice;

import java.util.Scanner;

public class ExamplePracticeMethod2_0418 {

	static int signOf(int n) {
		int result = 0;
		if (n < 0) {
			result = -1;
		} else if (n > 0) {
			result = +1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 입력한 int형 정숫값이 음수이면 -1을, 0이면 0을, 양수이면 1을 반환하는 
		// sign Of 메서드를 작성하자.
		Scanner sc = new Scanner(System.in);
		System.out.println("input int");
		int num = sc.nextInt();
		System.out.println(signOf(num));
	}

}
