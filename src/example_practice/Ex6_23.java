package example_practice;

public class Ex6_23 {

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -999;
        }
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("Max :" + max(data));
        System.out.println("Max :" + max(null));
        System.out.println("Max :" + max(new int[]{}));
    }
}
