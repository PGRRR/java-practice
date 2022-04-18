package example_practice;

public class ExamplePracticeOperator1_0418 {

	public static void main(String[] args) {
		// 점수에 따라서 90점 이상은 A, 80점 이상은 B, 나머지는 C 를 출력하는 조건 연산자
		int score = 100;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + " score " + grade + " grade");
	}

}
