package example_practice;

public class ExamplePracticeMethod1_0418 {
	
	public static int min(int num1, int num2, int num3) {
		int min = num1;
		if (num2 < min) {
			min = num2;
		}
		if (num3 < min) {
			min = num3;
		}
		return min;
	}
	
	public static void main(String[] args) {
		// 3개의 int형 인수 a, b, c 중 최솟값을 구하는 min 메서드를 작성하자.
		int a = 100;
		int b = 20;
		int c = 30;
		System.out.println(min(a, b, c));
	}
}
