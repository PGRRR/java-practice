package example_practice;

public class EAConstructorOverloadingTest0428 {
    public static void main(String[] args) {
        Test t = new Test(10.0, 10);
    }
}

class Test {
    int a;
    double b;

    Test(int a, double b) {
        this.a = a;
        this.b = b;
    }

    Test(double b, int a) {
        this.a = a;
        this.b = b;
    }
}