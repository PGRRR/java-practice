package ch6;

import java.util.Scanner;

public class MethodTest0415 {

	public static void main(String[] args) {
		System.out.println(1);
		Scanner sc = new Scanner(System.in);
		System.out.println("input");
		int num = sc.nextInt();
		int print = signOf(num);
		System.out.println(print);
	}
		static int signOf(int a){
			System.out.println(2);
			int result = 0;
			if(a < 0) {
				result = -1;
			} else if (a > 0){
				result = 1;
			}
			return result;
	}
}