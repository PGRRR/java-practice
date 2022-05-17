package ch16;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            Class z = Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
            System.out.println("error");
        }
    }
}
