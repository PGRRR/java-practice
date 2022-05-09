package javaBasic;

class MyParent {
    private int prv; // same class
    int dft; // same package
    protected int prt; // same package + same child
    public int pub; // free

    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}

public class MyParentTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println(p.prv); // error
        System.out.println(p.pub);
        System.out.println(p.dft);
        System.out.println(p.prt);

    }
}
