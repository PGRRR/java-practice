package ch5;

import java.util.Scanner;

public class Arr1_0412 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int [] {1, 2, 3, 4, 5};
		int i;
		// �ʱ�ȭ �� �� ���
		System.out.println("�ʱ�ȭ �� �� ���");
		for (i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i] + "\t");
	
		}
		System.out.println();
		
		// ����� �Է� �޾� �迭�� ����
		System.out.println("���� 5���� �Է��Ͻÿ�");
		for (i = 0; i < intArr.length; i++) {
			intArr[i] =sc.nextInt();
		}
		
		// �迭�� ����� �� ���
		System.out.println("�迭�� ����� �� ���");
		for (i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i] + "\t");
		}
	}

}
