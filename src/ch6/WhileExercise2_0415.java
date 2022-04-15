package ch6;

import java.util.Scanner;

public class WhileExercise2_0415 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		Out : while(run) {
			System.out.println("------------");
			System.out.println("1.|2.|3.|4.exit");
			System.out.println("------------");
			System.out.println("select> ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println(1);
				continue;
			case 2:
				System.out.println(2);
				continue;
			case 3:
				System.out.println(3);
				continue;
			case 4:
				break Out;
			default:
				System.out.println("wrong");
			}
			
		}
		System.out.println("exit");
	}

}
