package javaBasic;

abstract class Shape {
    Point1 p;

    Shape() {
        this(new Point1(0, 0));
    }

    Shape(Point1 p) {
        this.p = p;
    }

    abstract double calcArea();

    Point1 getPosition() {
        return p;
    }

    void setPosition(Point1 p) {
        this.p = p;
    }
}

class Point1 {
    int x;
    int y;

    Point1() {
        this(0, 0);
    }

    Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return x + ", " + y ;
    }
}

class Circle1 extends Shape {
    double r;

    Circle1(double r) {
        this(new Point1(0,0), r);
    }

    Circle1(Point1 p, double r) {
        super(p);
        this.r = r;
    }

    @Override
    double calcArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
//    double width;
//    double height;
//    boolean isSquare() {
////        return boolean;
//    }

    @Override
    double calcArea() {
        return 0;
    }
}

public class Ex7_22 {

}
