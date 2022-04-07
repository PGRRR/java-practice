package ch1;

import java.util.Scanner;

public class Test0407 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("값 입력");
		num = sc.nextInt();
		System.out.println(num);

		String address;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("주소 입력");
		address = sc2.nextLine();
		System.out.println(address);
	}
}
