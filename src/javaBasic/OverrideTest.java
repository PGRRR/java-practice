package javaBasic;

class Point {
    int x;
    int y;
    String getLocation(){
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point {
    int z;
}

public class OverrideTest {
    public static void main(String[] args) {
        Point3D p = new Point3D();
        p.x = 3;
        p.y = 5;
        p.z = 7;
        System.out.println(p.getLocation());
    }
}
