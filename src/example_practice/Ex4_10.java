package example_practice;

public class Ex4_10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
//        for (int i = 10000; i > 0; i= i/10) {
//            sum += num/i;
//            num -= num/i*i;
//        }

        System.out.println("sum = " + sum);
    }
}
