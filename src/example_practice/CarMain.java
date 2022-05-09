package example_practice;

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
        System.out.println("Speed : " + speed);
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car c = new Car("Hyundai", "Grand", "black", 360, 0);
        c.printCarInfo();
        c.maxSpeed = 60;
        System.out.println("Fixed max speed : " + c.maxSpeed);
    }
}
// 1. .java 소스 파일 생성 - ApplicationEx.java
// 2. 컴파일러 javac.exe 로 바이트 코드 파일 .class 생성 - javac ApplicationEx.java
// 3. Java Virtual Machine 구동하는 java.exe 실행 - java ApplicationEx
