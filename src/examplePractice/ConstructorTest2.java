package examplePractice;

class MyCar {
    String company = "Hyundai";
    String model = "Grand";
    String color = "black";
    int maxSpeed = 360;
    int speed;

    void printMyCarInfo(){
        System.out.println("Company : " + company);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Speed : " + speed);
    }
}

public class ConstructorTest2 {
    public static void main(String[] args) {
        MyCar mc = new MyCar();
        mc.printMyCarInfo();
        mc.maxSpeed = 60;
        System.out.println("Max Speed : " + mc.maxSpeed);
    }
}
