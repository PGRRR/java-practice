package example_practice;

import java.util.Scanner;

public class Ex7_1 {
   static int signOf(Scanner sc) {
       int num = sc.nextInt();
        return Integer.compare(num, 0);
    }
    public static void main(String[] args) {
        System.out.println("Input integer");
        int result = signOf(new Scanner(System.in));
        System.out.println(result);
    }
}
