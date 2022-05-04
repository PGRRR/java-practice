package ch14;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }
//    final override error
//    @Override
//    public void stop() {
//        System.out.println("Sports car stop");
//        speed = 0;
//    }
}
