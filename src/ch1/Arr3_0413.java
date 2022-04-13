package ch1;

import java.util.Scanner;

public class Arr3_0413 {

	public static void main(String[] args) {
		int i, sum = 0;
		float avg;
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5명의 수학 점수를 입력하시오");
		for (i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		} // 총점 구하기
		for (i = 0; i < score.length; i++) {
			sum += score[i];
		} // 평균 구하기
		avg = (float) sum / 5;
		System.out.println("총점 = " + sum + ", 평균 = " + avg);
	}

}
