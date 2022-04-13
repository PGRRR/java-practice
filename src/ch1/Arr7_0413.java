package ch1;

import java.util.Scanner;

public class Arr7_0413 {

	public static void main(String[] args) {
		// 세 사람의 이름을 저장할 배열
		String [] name = new String[3];
		
		// 세 사람의 국어, 영어, 수학, 총점을 저장할 배열
		int [][] score = new int [3][4];
		
		// 세 사람의 평균을 저장할 배열
		float [] avg = new float[3];
		
		// 타이틀로 사용할 문자열 목록
		String [] title = {"이름", "국어", "영어", "수학", "총점", "평균"};
		
		Scanner sc = new Scanner(System.in);
		int i, j;
		
		for (i = 0; i < score.length; i++) {
			System.out.println((i+1) + "번째 사람의 정보 입력");
			
			// i 번째 사람의 이름을 입력받는다.
			System.out.print(title[0] + "입력 : ");
			name[i] = sc.next();
			
			// i 번째 줄의 총점 칸을 0으로 초기화
			score[i][3] = 0;
			
			// i 번째 사람의 국영수 점수를 입력받고 총점을 구한다.
			for (j = 0; j < score[i].length -1; j++) {
				System.out.print(title[j + 1] + "점수 입력 : ");
				score[i][j] = sc.nextInt();
				
				//입력 받은 점수를 총점 칸에 누적
				score[i][3] += score[i][j];
			}
			// i 번째 사람의 평균을 계산하여 결과를 avg 배열에 저장
			avg[i] = (float)score[i][3]/3;
			System.out.println();
		}
		// 결과 타이틀 출력
		for (i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
		// 결과 출력
		for (i = 0; i < score.length; i++) {
			// i 번째 사람의 이름 출력
			System.out.print(name[i] + "\t");
			
			// i 번째 사람의 국, 영, 수, 총점을 출력
			for (j=0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			// i 번째 사람의 평균 출력
			System.out.print(avg[i] + "\n");
		}
	}

}
