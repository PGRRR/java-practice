package ch4;

import java.util.Scanner;

public class DoWhileExample0411 {

	public static void main(String[] args) {
		System.out.println("exit - press q");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		}while(! inputString.equals("q"));
		
		System.out.println();
		System.out.println("program end");
	}

}
