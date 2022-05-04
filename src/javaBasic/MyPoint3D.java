package javaBasic;

class MyPoint3 {
    int x;
    int y;

    MyPoint3() {

    }

    MyPoint3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x : " + x + ", y : " + y;
    }
}

public class MyPoint3D extends MyPoint3 {
    int z;

    MyPoint3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    String getLocation() {
        return "x : " + x + ", y : " + y + ", z : " + z;
    }
}

class PointTest {
    public static void main(String[] args) {
        MyPoint3D p3 = new MyPoint3D(1, 2, 3);
    }
}
