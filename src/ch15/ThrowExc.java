package ch15;

public class ThrowExc {
    String str = null;

    public String subStr(int idx) {
        if (str == null) {
            System.out.println("str 이 null 이다.");
            throw new NullPointerException();
        } else {
            return str.substring(idx);
        }
    }
}
