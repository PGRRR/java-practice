package example_practice;

import java.util.Scanner;

public class MaxAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer");
        int max = 0;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max : " + max);
    }
}
