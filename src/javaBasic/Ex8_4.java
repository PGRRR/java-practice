package javaBasic;

public class Ex8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4); // 실행 안된다.
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("true");
                System.out.println(ae.getMessage());
                ae.printStackTrace();
            }
            System.out.println("ArithmeticException");
        } catch (Exception e) { // 모든 예외 처리 가능
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
