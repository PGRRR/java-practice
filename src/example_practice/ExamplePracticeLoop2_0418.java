package example_practice;

import java.util.Scanner;

public class ExamplePracticeLoop2_0418 {

	public static void main(String[] args) {
		// �Է��� �������� ��� ����� �� ������ ǥ���ϴ� ���α׷��� �ۼ�����.
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
