package example_practice;

import java.util.Arrays;

public class CodeTest_1 {


    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        Arrays.sort(d);
        int budget = 9;
        int count = 0;
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
