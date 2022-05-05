package examplePractice;

class Car {
    String company;
    String model;
    String color;
    int maxSpeed;
    int speed;

    Car() {

    }

    Car(String company, String model, String color, int maxSpeed, int speed) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
    }

    void printCarInfo() {
        System.out.println("Company : " + company);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Max speed : " + maxSpeed);
        System.out.println("Current speed : " + speed);
    }

}

public class ConstructorTest {
    public static void main(String[] args) {
        Car c = new Car("Hyundai", "Grand", "black", 350, 0);
        c.printCarInfo();
        c.maxSpeed = 60;
        System.out.println("Fixed max speed : " + c.maxSpeed);
    }
}
