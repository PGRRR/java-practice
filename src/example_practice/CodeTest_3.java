package example_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CodeTest_3 {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!arrayList.contains(numbers[i] + numbers[j])) {
                arrayList.add(numbers[i] + numbers[j]);
                }
            }
        }
        arrayList.sort(Comparator.naturalOrder());
        int[] answer = new int[arrayList.size()];
        int size = 0;
        for (int tmp : arrayList) {
            answer[size++] = tmp;
        }
        System.out.println(Arrays.toString(answer));
    }
}
