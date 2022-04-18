package example_practice;

public class ExamplePracticeBreak1_0418 {

	public static void main(String[] args) {
		// char 형 대문자 A - a 순서로 소문자 g가 나올때까지 출력
		Outter:	for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower);
				if (lower == 'g') {
					break Outter;
				}
				
			}
		}
		System.out.println("loop end");
	}
}


