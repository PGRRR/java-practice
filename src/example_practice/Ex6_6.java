package example_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length");
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
