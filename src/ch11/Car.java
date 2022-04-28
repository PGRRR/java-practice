package ch11;

public class Car {
    int speed;

    int getSpeed() {
        return speed;
    }

    void keyTurnOn(){
        System.out.println("Turn the key");

    }

    void run(){
        for (int i = 10; i <= 50; i+=10){
            speed = i;
            System.out.println("run speed " + speed + "km/h");
        }
    }
}
