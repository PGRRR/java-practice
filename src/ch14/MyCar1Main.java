package ch14;

class MyCar1 {
    String company;
    String color;
    int maxSpeed;
    int speed;

    MyCar1() {

    }

    MyCar1(String company, String color, int maxSpeed, int speed) {
        this.company = company;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
    }

    void printCarInfo() {
        System.out.println("company : " + company);
        System.out.println("color : " + color);
        System.out.println("maxSpeed : " + maxSpeed);
        System.out.println("current speed : " + speed);
    }

}

public class MyCar1Main {
    public static void main(String[] args) {
        MyCar1 mc = new MyCar1("Hyundai", "black", 350, 0);
        mc.printCarInfo();
        mc.speed = 60;
        System.out.println("fixed speed : " + mc.speed);

    }
}
