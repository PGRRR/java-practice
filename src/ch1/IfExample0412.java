package ch1;

public class IfExample0412 {

	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다.");
		}
		
		if (score < 90)
			System.out.println("점수가 90부다 작습니다.");
			System.out.println("등급은 B 입니다."); // if 문과는 상관없는 실행문
		

	}

}
