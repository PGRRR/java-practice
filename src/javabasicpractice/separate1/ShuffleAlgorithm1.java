package javabasicpractice.separate1;

import java.util.Arrays;

public class ShuffleAlgorithm1 {
    static int[] shuffle(int [] arr){
        int tmp = 0;
        int rNum = (int)(Math.random()*arr.length);
        for (int i = 0; i < arr.length; i++) {
            tmp = arr[i];
            arr[i] = arr[rNum];
            arr[rNum] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}
