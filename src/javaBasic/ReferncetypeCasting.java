package javaBasic;

public class ReferncetypeCasting {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
//        car.water();
        fe2 = (FireEngine)car;
        fe2.water();
    }
}
class Car {
    String color;
    int door;

    void drive(){
        System.out.println("Drive mode");
    }

    void stop(){
        System.out.println("Stop");
    }
}
class FireEngine extends Car{
    void water(){
        System.out.println("Water");
    }
}