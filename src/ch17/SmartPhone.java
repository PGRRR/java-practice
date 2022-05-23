package ch17;

public class SmartPhone {

    String a;
    String b;
    SmartPhone() {

    }

    SmartPhone(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String toString(String a, String b) {
        return a + ", " + b;
    }
}
