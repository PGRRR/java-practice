package ch13;

public class MyInterfaceMain {
    public static void main(String[] args) {
        MyImplements m = new MyImplements();
        m.mul();
        System.out.println("add() result = " + m.add());
    }
}
