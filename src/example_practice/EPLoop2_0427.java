package example_practice;

import java.util.Scanner;

public class EPLoop2_0427 {
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100)+1;
        int input = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        do {
            count++;
            System.out.println("1怨� 100�궗�씠�쓽 媛믪쓣 �엯�젰�븯�꽭�슂 : ");
            input = sc.nextInt();
            if (input > answer){
                System.out.println("�뜑 �옉�� �닔瑜� �엯�젰�븯�꽭�슂.");
            } else if (input < answer) {
                System.out.println("�뜑 �겙 �닔瑜� �엯�젰�븯�꽭�슂.");
            } else if (input == answer){
                System.out.println("�젙�떟�엯�땲�떎.");
                System.out.println("�떆�룄 �슏�닔�뒗 " + count + "踰덉엯�땲�떎.");
                break;
            }
        }while (true);
        }
    }

