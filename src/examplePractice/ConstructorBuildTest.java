package examplePractice;

class Car2 {
    String company = "Hyundai";
    String model = "Grand";
    String color = "black";
    int maxSpeed = 360;
    int speed;
    Car2(){}
    void printCarInfo(){
        System.out.println(company);
        System.out.println(model);
        System.out.println(color);
        System.out.println(maxSpeed);
        System.out.println(speed);
    }
}

public class ConstructorBuildTest {
    public static void main(String[] args) {
        Car2 c = new Car2();
        c.printCarInfo();
        c.maxSpeed = 60;
        System.out.println(c.maxSpeed);

    }
}
