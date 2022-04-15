package ch4;

import java.util.Scanner;

public class Test1_0408 {

	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� �Է�");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("��� �Դϴ�");
		}else if (num == 0){
			System.out.println("0 �Դϴ�");
		}
		else {
			System.out.println("���� �Դϴ�");
		}
		
	}

}
