package example_practice;

import java.util.Scanner;

public class ExamplePracticeConditional1_0418 {

	public static void main(String[] args) {
		// �������� �о� ��ȣ(���/����/0)�� �����ϴ� ���α׷��� �ۼ�����.
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
