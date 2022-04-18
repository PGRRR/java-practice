package example_practice;

public class ExamplePracticeArray2_0418 {

	public static void main(String[] args) {
		// 요소 개수가 5개인 int형 배열에 순서대로 5, 4, 3, 2, 1을 대입하는 프로그램을 작성하자
		int [] array = new int [5];
		for (int i = 0; i < array.length; i++) {
			array[i] = 5 - i;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
