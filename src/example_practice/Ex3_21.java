package example_practice;

import java.util.Scanner;

public class Ex3_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input month");
        int month = sc.nextInt();
        switch (month) {
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Wrong month");
        }
    }
}
