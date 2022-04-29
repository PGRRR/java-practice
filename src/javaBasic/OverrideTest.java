package javaBasic;

class Point {
    int x;
    int y;

    String getLocation() {
        return "x : " + x + ", y : " + y;
    }

    public String toString() {
        return "x:" + x + ",y:" + y;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // overriding
    String getLocation() {
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        Point3D p = new Point3D(10, 20, 30);
//        p.x = 10;
//        p.y = 20;
//        p.z = 30;
        System.out.println(p);
        System.out.println(p.getLocation());
    }
}
