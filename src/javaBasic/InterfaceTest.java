package javaBasic;

class A {
    public void method(I b) {
        b.method();
    }
}

interface I {
    void method();
}

class B implements I {
    public void method() {
        System.out.println("method in B");
    }
}

class C implements I {
    public void method() {
        System.out.println("method in c");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new C()); // A 가 B 를 사용 (의존)
        // = B b = new B(); a.method(b);
    }
}
