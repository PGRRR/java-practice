package ch15;

public class StringConvert {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("java");
        char[] arr = {'g', 'o', 'o', 'd'};
        String str3 = new String(arr);
        String str4;
        str4 = str1 + " " + str2 + " " + str3;
        System.out.println(str4);

        String s_i = "123";
        String s_f = "23.5";
        String s_d = "234.567";
        int i = Integer.parseInt(s_i);
        float f = Float.parseFloat(s_f);
        double d = Double.parseDouble(s_d);
        System.out.println("String sum : " + s_i + s_f + s_d);
    }
}
