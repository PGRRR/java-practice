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

//�迭�� ��� ���� ���� ����� ���� �Է� �޾Ƽ� ǥ���ϴ� ���α׷��� �ۼ�����. 
//ǥ�������� �迭 �ʱ갪�� ���� ��������, �� ����� ���� ��ǥ�� �����ϰ� {}�� ���� �����̴�.