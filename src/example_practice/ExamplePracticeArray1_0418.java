package example_practice;

import java.util.Scanner;

public class ExamplePracticeArray1_0418 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("length");
		int arraySize= sc.nextInt();
			System.out.println("input int");
		int [] array = new int [arraySize];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print("}");
	}
}

//배열의 요소 수와 개별 요소의 값을 입력 받아서 표시하는 프로그램을 작성하자. 
//표시형식은 배열 초깃값과 같은 형식으로, 각 요소의 값을 쉼표로 연결하고 {}로 감싼 형태이다.