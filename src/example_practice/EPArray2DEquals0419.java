package example_practice;

import java.util.Scanner;

public class EPArray2DEquals0419 {

	public static void main(String[] args) {
		String [][] qna = {
				{"Java", "eclipse"},
				{"HTML", "VScode"},
				{"JS", "VScode"}
		};
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < qna.length; i++) {
			System.out.printf("Q%d. %s editor%n", i + 1, qna[i][0]);
			String answer = sc.nextLine();
			if (answer.equals(qna[i][1])) {
				System.out.println("Pass");
			} else {
				System.out.printf("Fail, the answer is %s%n%n", qna[i][1]);
			}
		}
	}

}
