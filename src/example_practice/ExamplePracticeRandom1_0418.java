package example_practice;

public class ExamplePracticeRandom1_0418 {

	public static void main(String[] args) {
		// 숫자 1부터 6까지 랜덤으로 숫자 6이 나올때까지 숫자를 출력하는 무한 반복문 
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