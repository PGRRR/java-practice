package ch1;

public class SignOperatorExample0407 {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		short s = 100;
		//short result3 = -s; // 컴파일 에러 부호 연산을 하면 int 타입 값으로 바뀐다
		int result3 = -s;
		System.out.println("result3 = " + result3);
	}

}
