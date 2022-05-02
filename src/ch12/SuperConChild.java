package ch12;

public class SuperConChild extends SuperConParent {
    private int c;

    public SuperConChild(int a, int b, int c) {
        super(a, b);
        System.out.println("SuperConChild Const");
        this.c = c;
    }

    public void print() {
        super.print();
        System.out.println("c = " + c);

    }
}
