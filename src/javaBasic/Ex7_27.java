package javaBasic;

class Outer1 {
    int value = 10;

    class Inner {
        int value = 20;
        void method1() {
            int value = 30;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer1.this.value);
        }
    }

}

public class Ex7_27 {
    public static void main(String[] args) {
        Outer1 out = new Outer1();
        Outer1.Inner inner = out.new Inner();
        inner.method1();
    }
}
