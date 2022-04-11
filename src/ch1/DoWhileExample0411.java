package ch1;

import java.util.Scanner;

public class DoWhileExample0411 {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램이 종료되면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		}while(! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
