package javabasicpractice;

public class EPConditional10_0427 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++){
            for (int j = 2; j < 5; j++){
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i < 4; i++){
            for (int j = 5; j < 8; j++){
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i < 4; i++){
            for (int j = 8; j < 10; j++){
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}
