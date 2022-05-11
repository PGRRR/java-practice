package example_practice;

public class Ex7_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;
        int min = 0;
        if (a > b) {
            min = b;
        } else if (c > b) {
            min = b;
        } else {
            min = c;
        }
        System.out.println(min);
    }
}
