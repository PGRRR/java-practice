package ch14;

import java.util.Scanner;

public class MaxArrAlgorithm {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 10개 입력");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for (int i = 0; i < 10; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
