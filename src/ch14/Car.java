package ch14;

public class Car {
    public int speed;

    public void speedUp() {
        speed += 1;
    }

    public final void stop() {
        System.out.println("Stop car");
        speed = 0;
    }
}
