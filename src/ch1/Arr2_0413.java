package ch1;

import java.util.Scanner;

public class Arr2_0413 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, max;
		int [] arr = new int [10];
		System.out.println("정수 10개를 입력하라");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// max의 배열 첫 값으로 초기화
		max = arr [0]; // 비교 대상 시작용
		// 입력 받은 10개의 숫자 중 가장 큰 값을 구한다.
		for (i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max = " + max);
	}

}
