package example_practice;

class MyCar {
    String company = "Hyundai";
    String model = "Grand";
    String color = "black";
    int maxSpeed = 360;
    int speed;

    MyCar(){}

    void printMyCarInfo(){
        System.out.println("Company : " + company);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Max speed : " + maxSpeed);
        System.out.println("Speed : " + speed);
    }
}

public class ConstructorTest2 {
    public static void main(String[] args) {
        MyCar c = new MyCar();
        c.printMyCarInfo();
        c.maxSpeed = 60;
        System.out.println("Fixed max speed : " + c.maxSpeed);
    }
}
