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
		// �Է��� int�� �������� �����̸� -1��, 0�̸� 0��, ����̸� 1�� ��ȯ�ϴ� 
		// sign Of �޼��带 �ۼ�����.
		Scanner sc = new Scanner(System.in);
		System.out.println("input int");
		int num = sc.nextInt();
		System.out.println(signOf(num));
	}

}
