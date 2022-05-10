package javaBasic;

public class Ex7_12 {
    class InstanceInner {
        int iv = 100;
        //        static int cv = 100; // error, static 변수 선언 불가
        final static int CONST = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200; // static 클래스만 static 멤버를 정의할 수 있다.
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
            //            static int cv = 300; // error, static 변수 선언 불가
            final static int CONST = 300; // final static 은 상수이므로 허용
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
//        System.out.println(LocalInner.CONST); // 지역 변수는 호출 불가, 메서드 내에서만 가능

    }
}

