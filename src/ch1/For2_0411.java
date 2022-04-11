package ch1;

public class For2_0411 {

	public static void main(String[] args) {
		int i;
		System.out.println("1~100까지의 홀수");
		for (i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i+"\t");
			}
			if(i % 10 == 0) {
				System.out.println();
			}
		}

	}

}
