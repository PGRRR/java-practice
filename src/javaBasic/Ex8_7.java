package javaBasic;

public class Ex8_7 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("CATCH");
        }
        System.out.println("FIN");
    }
}
