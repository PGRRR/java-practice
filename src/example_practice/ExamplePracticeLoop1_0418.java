package example_practice;

import java.util.Scanner;

public class ExamplePracticeLoop1_0418 {

	public static void main(String[] args) {
		// �Է��� ���� ������ŭ '*'�� ǥ���ϴ� ���α׷��� �ۼ�����.
		// ���������� �� �ٲ� ���ڸ� ����� ��.
		// ��, ���� ���� 1�̸��̸� �� �ٲ� ���ڸ� ǥ���ؼ��� �� �ȴ�.
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
