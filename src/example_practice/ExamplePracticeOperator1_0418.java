package example_practice;

public class ExamplePracticeOperator1_0418 {

	public static void main(String[] args) {
		// int 타입 변수 score 에 있는 값을 삼항연산자로 
		// 90이상이면 A 80이상이면 B 나머지는 C 결과 char 타입 grade 변수에 초기화
		int score = 100;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + " score " + grade + " grade");
	}

}
