package ch4;

import java.util.Scanner;

public class SwitchTestString0408 {

	public static void main(String[] args) {
		String grade = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("�г��� �Է��϶�");
		grade = sc.next();
		switch(grade) {
		case"1�г�":
			System.out.println("1�г� �Դϴ�");
			//break;
		case "2�г�":
			System.out.println("2�г� �Դϴ�");
			break;
		case "3�г�":
			System.out.println("3�г� �Դϴ�");
			break;
		case "4�г�":
			System.out.println("4�г� �Դϴ�");
			break;
		default:
			System.out.println("�г��� �߸� �Է��ϼ̽��ϴ�");
			break;
		}

	}

}
