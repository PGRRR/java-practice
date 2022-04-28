package example_practice;

public class EPConditional4_0427 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (!(sum >= 100)) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
            i++;
        }
        System.out.println(i);
    }
}
