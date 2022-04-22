package ch8;

class Car {
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
}

public class CarMain {
	public static void main(String[] args) {
		Car kCar = new Car();
		kCar.company = "Hyundai";
		kCar.model = "Grandeur";
		kCar.color = "Black";
		kCar.maxSpeed = 350;
		System.out.println("Company : " + kCar.company);
		System.out.println("Model : " + kCar.model);
		System.out.println("Color : " + kCar.color);
		System.out.println("Max speed : " + kCar.maxSpeed);
		System.out.println("Current speed : " + kCar.speed);
		kCar.speed = 60;
		System.out.println("Changed speed : " + kCar.speed);
	}
}
