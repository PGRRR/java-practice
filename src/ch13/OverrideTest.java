package ch13;

class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x : " + x + ", y : " + y;
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        Point p = new Point(3, 5);
//        Point p = new Point();
//        p.x = 3;
//        p.y = 5;
        System.out.println(p);
//        System.out.println(p.toString());
//        System.out.println(p.x);
//        System.out.println(p.y);
    }
}
