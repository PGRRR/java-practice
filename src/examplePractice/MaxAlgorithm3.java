package examplePractice;

import java.util.Scanner;

public class MaxAlgorithm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int max = 0;
        System.out.println("Input integer");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max : " + max);
    }
}
