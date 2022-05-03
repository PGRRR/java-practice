package ch13;

import java.util.Scanner;

public class MaxMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer a");
        int a = sc.nextInt();
        System.out.println("Input integer b");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("a, b same");
        }
    }
}
