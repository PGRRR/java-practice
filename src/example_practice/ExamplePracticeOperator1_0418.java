package example_practice;

public class ExamplePracticeOperator1_0418 {

	public static void main(String[] args) {
		// ������ ���� 90�� �̻��� A, 80�� �̻��� B, �������� C �� ����ϴ� ���� ������
		int score = 100;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + " score " + grade + " grade");
	}

}
