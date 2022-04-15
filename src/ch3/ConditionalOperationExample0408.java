package ch3;

public class ConditionalOperationExample0408 {

	public static void main(String[] args) {
		int score = 95;
		char grade = (score > 90) ? 'A' : ((score > 80 ? 'B' : 'C'));
		System.out.println(score + "���� " + grade + "����Դϴ�.");

	}

}
