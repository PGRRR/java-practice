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
		// 3���� int�� �μ� a, b, c �� �ּڰ��� ���ϴ� min �޼��带 �ۼ�����.
		int a = 100;
		int b = 20;
		int c = 30;
		System.out.println(min(a, b, c));
	}
}
