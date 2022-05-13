package javaBasic;

public class Ex8_9 {
    public static void main(String[] args) throws Exception {
        method1(); // 3. try-catch 없음 = 떠넘기기 (JVM)
    }

    static void method1() throws Exception {
        method2(); // 2. try-catch 없음 = 떠넘기기 (main())
    }

    static void method2() throws Exception {
        throw new Exception(); // 1. 예외 발생
    }
}
