package ch15;

public class CarExample {
    public static void main(String[] args) {
        Car1 myCar = new Car1();

        myCar.run();

        myCar.frontRightTire = new KumhoTire();
        myCar.frontLeftTire = new KumhoTire();

        myCar.run();
    }
}
