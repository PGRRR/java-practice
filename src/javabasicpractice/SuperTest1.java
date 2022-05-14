package javabasicpractice;

public class SuperTest1 {
    public static void main(String[] args) {
        Parent12 p = new Child12();
        Child12 c = new Child12();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent12 {
    int x = 100;
    void method(){
        System.out.println("Parent Method");

    }
}

class Child12 extends Parent12 {

    int x = 200;

    void method(){
        System.out.println("Child Method");
    }
}
//  200 200