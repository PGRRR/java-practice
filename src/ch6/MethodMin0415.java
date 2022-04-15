package ch6;

import java.util.Scanner;

public class MethodMin0415 {
	
	static int min (int a, int b, int c) {
		int result = a;
		if (b < result) {
			result = b;
		}
		if (c < result) {
			result = c;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input 3");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(min(a,b,c));

	}

}
