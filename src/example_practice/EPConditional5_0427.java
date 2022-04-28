package example_practice;

public class EPConditional5_0427 {
    public static void main(String[] args) {
//        for (int i=0; i<=10; i++){
//            for(int j=0; j<=i; j++){
//                System.out.println("*");
//                System.out.println();
//            }
//        }
        int i = 0;
        int j = 0;
        while (i <= 10 && j <= i) {
            i++;
            j++;
            System.out.println("*");
            System.out.println();
        }
    }
}

