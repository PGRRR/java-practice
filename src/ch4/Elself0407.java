package ch4;

import java.util.Scanner;

public class Elself0407 {

	public static void main(String[] args) {
		int jumsu;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��϶�");
		jumsu=sc.nextInt();
		if(jumsu>=90) {					// 90 �̻�
			System.out.println("A");	
		}else if (jumsu>=80) {			// 80�̻� 90�̸�
			System.out.println("B");
		}else if (jumsu>=70) {			// 70�̻� 80�̸�
			System.out.println("C");
		}else if (jumsu>=60) {			// 60�̻� 70�̸�
			System.out.println("D");
		}else {							// 60�̸�
			System.out.println("F");
		}
	}
}
		

