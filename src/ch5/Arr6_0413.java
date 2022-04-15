package ch5;

import java.util.Scanner;

public class Arr6_0413 {

	public static void main(String[] args) {
		// ������� ����, ����, ����, ������ ������ �迭 ����
		int [][] score = new int [3][4];
		
		// Ÿ��Ʋ�� ����� ���ڿ� ���
		String[] title = {"����", "����", "����", "����"};
		
		Scanner sc = new Scanner(System.in);
		int i, j;
		
		for(i = 0; i < score.length; i++) {
			//�� ���� ���� ĭ�� 0���� �ʱ�ȭ
			score[i][3] = 0;
			
			// ������ ������ �Է¹ް� ������ ���Ѵ�.
			System.out.println(i + "��° ���� ���� �Է�");
			for(j = 0; j < score[i].length - 1; j++) {
				System.out.println(title[j] + "���� �Է� : ");
				score[i][j] = sc.nextInt();
				
				// �Է� ���� ������ ���� ĭ�� ����
				score[i][3] += score[i][j];
			}
			System.out.println();
		}
		// ��� Ÿ��Ʋ ���
		for (i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();

		// ��� ���
		for (i = 0; i < score.length; i++) {
			for (j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
