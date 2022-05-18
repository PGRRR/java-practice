package example_practice;

import java.util.Scanner;

public class Ex4_14 {
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100)+1;
        int input = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        do {
            count++;
            System.out.println("input");
            input = sc.nextInt();

            if (input > answer) {
                System.out.println("smaller");
            } else if (input < answer) {
                System.out.println("bigger");
            } else {
                System.out.println("Correct");
                System.out.println(count);
                break;
            }

        } while (true);
    }
}
