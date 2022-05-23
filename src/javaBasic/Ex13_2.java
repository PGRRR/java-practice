package javaBasic;

public class Ex13_2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        System.out.print(System.currentTimeMillis() - startTime);

        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.print(System.currentTimeMillis() - startTime);
    }
}
