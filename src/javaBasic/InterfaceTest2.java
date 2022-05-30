package javaBasic;

interface I2 {
    public abstract void method();
}

class B2 implements I2 {

    @Override
    public void method() {
        System.out.println("hi");
    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {
    }
    public static void methodA(I2 i2) {
        i2.method();
    }
}
