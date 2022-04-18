package example_practice;

import java.util.Scanner;

public class ExamplePracticeConditional2_0418 {

	public static void main(String[] args) {
		// 월을 1~12의 정숫값으로 읽어서 해당하는 계절을 표시하는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);
		System.out.println("input month");
		int month = sc.nextInt();
		switch (month) {
		case 3: case 4: case 5:{
			System.out.println("Spring");
			break;
		}
		case 6: case 7: case 8:{
			System.out.println("Summer");
			break;
		}
		case 9: case 10: case 11:{
			System.out.println("Autumn");
			break;
		}
		case 12: case 1: case 2:{
			System.out.println("Winter");
			break;
		}
		default:
			System.out.println("Not A Month");
			break;
		}

	}

}
