package example_practice;

import java.util.Scanner;

public class Ex4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        if (num < 1) {
            return;
        } else {
            System.out.println();
        }
    }
}
