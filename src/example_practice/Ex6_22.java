package example_practice;

public class Ex6_22 {
    public static boolean isNumber(String str) {
        if (str == null || str.equals("")) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (!('0' < ch && ch <= '9')) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String str = "123o";
        System.out.println(str + "is number?" + isNumber(str));
    }
}
