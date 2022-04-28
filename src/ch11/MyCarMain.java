package ch11;

public class MyCarMain {
    public static void main(String[] args) {
        MyCar myCar = new MyCar("porsche");
        MyCar yourCar = new MyCar("Benz");

        myCar.run();
        yourCar.run();
    }
}
