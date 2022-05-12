package ch15;

import java.util.Scanner;

public class NumLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer");
        String num = sc.next();
        int numLen = num.length();
        System.out.println("Length : " + numLen);
    }
}
