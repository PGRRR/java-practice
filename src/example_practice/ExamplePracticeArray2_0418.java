package example_practice;

public class ExamplePracticeArray2_0418 {

	public static void main(String[] args) {
		// ��� ������ 5���� int�� �迭�� ������� 5, 4, 3, 2, 1�� �����ϴ� ���α׷��� �ۼ�����
		int [] array = new int [5];
		for (int i = 0; i < array.length; i++) {
			array[i] = 5 - i;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
