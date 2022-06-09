package example_practice;

import java.util.Scanner;

public class Ex65_8_1 {
    public static void main(String[] args) {
        // try-catch 문을 통해 프로그램 실행 중 발생하는 런타임 예외를 처리하므로 프로그램이 비정상 종료되지 않게 한다.
        // 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기 위한 변수

        do {
            count++;
            System.out.print("1과 100사이 값 :");
            try {
                input = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("지원하지 않는 값입니다.");
                continue;
            }
            if(answer > input) {
                System.out.println("더 큰 수 .");
            } else if(answer < input) {
                System.out.println("더 작은 수 .");
            } else {
                System.out.println("정답 .");
                System.out.println("시도 횟수 "+count+"번 .");
                break; // do-while문을 벗어난다
            }
        } while(true); // 무한반복문

    }
}
