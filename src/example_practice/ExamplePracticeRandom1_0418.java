package example_practice;

public class ExamplePracticeRandom1_0418 {

	public static void main(String[] args) {
		// ���� 1���� 6���� �������� ���� 6�� ���ö����� ���ڸ� ����ϴ� ���� �ݺ��� 
		while (true) {
			int num = (int)(Math.random()*6 + 1);
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("infinity loop end");
	}
}