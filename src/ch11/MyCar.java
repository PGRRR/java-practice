package ch11;

public class MyCar {
    String model;
    int speed;

    MyCar(String model){
        this.model = model;
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    void run(){
        for (int i = 10; i <= 50; i +=10){
            this.setSpeed(i);
            System.out.println(this.model + " run speed : " + this.speed + "km/h");
        }
    }
}
