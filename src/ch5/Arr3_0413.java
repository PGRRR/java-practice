package ch5;

import java.util.Scanner;

public class Arr3_0413 {

	public static void main(String[] args) {
		int i, sum = 0;
		float avg;
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5���� ���� ������ �Է��Ͻÿ�");
		for (i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		} // ���� ���ϱ�
		for (i = 0; i < score.length; i++) {
			sum += score[i];
		} // ��� ���ϱ�
		avg = (float) sum / 5;
		System.out.println("���� = " + sum + ", ��� = " + avg);
	}

}
