package ch4;

import java.util.Scanner;

public class Elself0407 {

	public static void main(String[] args) {
		int jumsu;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input score");
		jumsu=sc.nextInt();
		if(jumsu>=90) {					// 90 over
			System.out.println("A");	
		}else if (jumsu>=80) {			
			System.out.println("B");
		}else if (jumsu>=70) {			
			System.out.println("C");
		}else if (jumsu>=60) {			
			System.out.println("D");
		}else {							
			System.out.println("F");
		}
	}
}
		

