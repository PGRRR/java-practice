package example_practice;


import java.util.ArrayList;
import java.util.Arrays;

public class CodeTest_2 {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] answers = {1, 2, 3, 4, 5, 2, 3, 4, 5, 2, 3, 4, 5, 2, 3, 4, 5, 2, 3, 4, 5, 2, 3, 4, 5};
        int[] count = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) {
                count[0]++;
            }
            if (answers[i] == second[i % second.length]) {
                count[1]++;
            }
            if (answers[i] == third[i % third.length]) {
                count[2]++;
            }
        }
        int max = Math.max(count[0], count[1]);
        int max1 = Math.max(max, count[2]);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (count[i] == max1) {
                arrayList.add(i + 1);
            }
        }
        int[] answer = new int[arrayList.size()];
        int size = 0;
        for (int temp : arrayList) {
            answer[size++] = temp;
        }
        System.out.println(Arrays.toString(answer));
    }
}

