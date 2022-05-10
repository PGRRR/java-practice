package ch15;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("개수 입력");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print("+");
            }
        }
        System.out.println();
    }
}
