package javaBasic;

@FunctionalInterface
public interface MyFunction {
    public abstract int max(int a, int b);
}

class Ex14_0 {
    public static void main(String[] args) {
//        MyFunction f = new MyFunction() {
//            @Override
//            public int max(int a, int b) {
//                return a > b ? a : b;
//            }
//        };
        MyFunction f = (a, b) -> a > b ? a : b;
        int value = f.max(3, 5);
    }
}