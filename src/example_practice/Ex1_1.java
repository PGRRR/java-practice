package example_practice;

import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer");
        int num = sc.nextInt();
        String result = (num == 0) ? "0" : (num > 0) ? "양수" : "음수";
        System.out.println(result);
    }


}
