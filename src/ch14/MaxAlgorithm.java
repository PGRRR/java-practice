package ch14;

import java.util.Scanner;

public class MaxAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Input integer");
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max num : " + max);
    }
}