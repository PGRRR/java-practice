package ch14;

public class Computer extends Calculator {
    @Override
    double areaCircle(double r) {
        System.out.println("Computer object areaCircle() execute");
        return Math.PI * r * r;
    }
}
