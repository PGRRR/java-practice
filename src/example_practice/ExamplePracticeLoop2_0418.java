package example_practice;

import java.util.Scanner;

public class ExamplePracticeLoop2_0418 {

	public static void main(String[] args) {
		// 입력한 정숫값의 모든 약수와 그 개수를 표시하는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);
		System.out.println("input int");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i < num; i++) {
			if (num%i == 0) {
				System.out.print(i + "\t");
				count++;
			}
			
		}
		System.out.println();
		System.out.println("count " + count);
	}

}
