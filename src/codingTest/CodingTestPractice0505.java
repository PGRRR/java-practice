package codingTest;

import java.util.Scanner;

// 1. .java 소스 파일 작성 - ApplicationEx.java
// 2. 컴파일러 javac.exe 를 통해 바이트 코드 파일 .class 생성 - javac ApplicationEx.java
// 3. Java Virtual Machine 구동 파일 java.exe 실행 - java ApplicationEx
public class CodingTestPractice0505 {
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//    }

//    public static void main(String[] args) {
//        for (int i = 2; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " * " + j + " = " + i*j);
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input integer");
//        int max = 0;
//        int num = 0;
//        for (int i = 0; i < 10; i++) {
//            num = sc.nextInt();
//            if (num > max) {
//                max = num;
//            }
//        }
//        System.out.println(max);
//    }

    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input integer");
//        int[] arr = new int[10];
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }


//
//    public static void main(String[] args) {
//        Car c = new Car();
//        System.out.println("Company : " + c.company);
//        System.out.println("Model : " + c.model);
//        System.out.println("Color : " + c.color);
//        System.out.println("Max Speed : " + c.maxspeed);
//        System.out.println("Speed : " + c.speed);
//        c.maxspeed = 60;
//        System.out.println("Fixed Max Speed : " + c.maxspeed);
//
//
//    }
//}
//class Car {
//    String company = "Hyundai";
//    String model = "Grand";
//    String color = "black";
//    int maxspeed = 360;
//    int speed;
//    Car(){}
//}
public static void main(String[] args) {
    Car c = new Car("Hyundai", "Grand", "black", 360, 0);
    c.printCarInfo();
    c.maxSpeed = 60;
    System.out.println("Fixed Max Speed : " + c.maxSpeed);

}

}
class Car{
    String company;
    String model;
    String color;
    int maxSpeed;
    int speed;
    Car(){}
    Car(String company, String model, String color, int maxSpeed, int speed){
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
    }
    void printCarInfo(){
        System.out.println("Company : " + company);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Speed : " + speed);
    }
}
