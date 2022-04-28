package ch11;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("Current speed " + speed + "km/h");
    }
}
