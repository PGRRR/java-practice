package ch14;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = (Parent)child;
        parent.method1();
        parent.method2();
//        parent.method3();
    }
}
