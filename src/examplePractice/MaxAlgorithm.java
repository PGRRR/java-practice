package examplePractice;

import java.util.Scanner;

public class MaxAlgorithm {
    public static void main(String[] args) {
        int max = 0;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer");
        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max number : " + max);
    }

}
