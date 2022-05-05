package codingTest;

public class codingTestPlusMinus0423 {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int result = 0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {;
                result += absolutes[i];
            } else {
                result -= absolutes[i];
            }
        }
        System.out.println(result);
    }
}