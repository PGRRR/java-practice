package ch4;

public class WhileExercise1_0415 {

	public static void main(String[] args) {
		int sum = 0;
		while(sum != 5) {
		int result1 = (int) (Math.random()*6+1);
		int result2 = (int) (Math.random()*6+1);
		sum = result1 + result2;
		System.out.println(result1 + ", " + result2);
		}
		System.out.println("END");
	}
}
