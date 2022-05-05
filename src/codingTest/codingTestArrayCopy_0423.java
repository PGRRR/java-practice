package codingTest;

import java.util.Arrays;

public class codingTestArrayCopy_0423 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2D = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] cutArr;
        int[] reArr = new int[arr.length];
        for (int i = 0; i < arr2D.length; i++) {
            cutArr = Arrays.copyOfRange(arr, arr2D[i][0] - 1, arr2D[i][1]);
            Arrays.sort(cutArr);
            reArr[i] = cutArr[arr2D[i][2] - 1];
        }
        System.out.println(Arrays.toString(reArr));
    }
}