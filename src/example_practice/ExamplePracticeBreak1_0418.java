package example_practice;

public class ExamplePracticeBreak1_0418 {

	public static void main(String[] args) {
		// char �� �빮�� A - a ������ �ҹ��� g�� ���ö����� ���
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


