package LottoProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LottoProgram {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            list.add((int) (Math.random() * 45) + 1);
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    i--;
                    break;
                }
            }
        }
        list.sort(null);
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("로또 번호 6개를 입력해주세요.");
        int count = 0;
        for (int i = 0; i < 6; i++) {
            int num = sc.nextInt();
            if (num > 45) {
                System.out.println("정확한 번호를 입력해주세요.");
                i--;
            } else {
                arr[i] = num;
                if (list.contains(num)) {
                    count++;
                }
            }
        }
        System.out.println("입력 번호 : " + Arrays.toString(arr));
        System.out.println("당첨 번호 : " + list);
        if (count == 0) {
            System.out.println("낙첨");
        } else {
            System.out.println((7 - count) + " 등 당첨!");
        }
    }
}
