package javabasicpractice;

public class NumberMethod {

    static boolean isNumber(String str) {
        if (str == "" || str == null) {
            return false;
        }
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                return false;
            } else {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
