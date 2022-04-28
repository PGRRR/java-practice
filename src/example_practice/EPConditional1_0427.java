package example_practice;

public class EPConditional1_0427 {
    public static void main(String[] args) {
        int x = 15;
        char ch = 0;
        boolean powerOn = false;
        String str = "yes";
        if (10 < x && x < 20) {
            if (!(ch == ' ' || ch == '\t')) {
                if (ch == 'x' && ch == 'X') {
                    if (0 <= ch && ch <= 9) {
                        if ((x % 400 == 0 || x % 4 == 0) && x % 100 == 0) {
                            if (powerOn == false) {
                                if (str.equals("yes")) {

                                }

                            }
                        }
                    }
                }
            }
        }
    }
}
