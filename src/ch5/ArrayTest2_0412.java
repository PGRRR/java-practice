package ch5;

import java.util.Scanner;

public class ArrayTest2_0412 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, max;
		int input = sc.nextInt();
		System.out.println("���� �Է�");
		int [] arr = new int [10];
		
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// max�� �迭 ù ������ �ʱ�ȭ
		max = arr [0]; // �� ��� ���ۿ�
		// �Է� ���� 10���� ���� �� ���� ū ���� ���Ѵ�.
		for (i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max = " + max);
	}

}