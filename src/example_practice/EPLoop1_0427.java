package example_practice;

public class EPLoop1_0427 {
    public static void main(String[] args) {
        String value = "12034";
        char ch = ' ';
        boolean isNumber = true;

        for (int i = 0; i < value.length(); i++) {
            if (0 <= value.charAt(i) && value.charAt(i) <= 9) {
                isNumber = true;
            } else {
                isNumber = false;
            }
        }
        if (isNumber) {
            System.out.println(value + "�뒗 �닽�옄�엯�땲�떎.");
        } else {
            System.out.println(value + "�뒗 �닽�옄媛� �븘�떃�땲�떎.");
        }
    }
}
