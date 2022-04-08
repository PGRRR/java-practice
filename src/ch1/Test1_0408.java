package ch1;

import java.util.Scanner;

public class Test1_0408 {

	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 값 입력");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("양수 입니다");
		}else if (num == 0){
			System.out.println("0 입니다");
		}
		else {
			System.out.println("음수 입니다");
		}
		
	}

}
