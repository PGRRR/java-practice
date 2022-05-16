package ch15;

public class InterExample {
    public static void main(String[] args) {
        ImpleC impl = new ImpleC();

        InterA ia = impl;
        ia.methodA();
        System.out.println();

        InterB ib = impl;
        ib.methodB();
        System.out.println();

        InterC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }
}
