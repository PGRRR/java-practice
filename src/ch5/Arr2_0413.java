package ch5;

import java.util.Scanner;

public class Arr2_0413 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, max;
		int [] arr = new int [10];
		System.out.println("���� 10���� �Է��϶�");
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
