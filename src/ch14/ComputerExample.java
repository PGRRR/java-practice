package ch14;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator cal = new Calculator();
        System.out.println("Circle area : " + cal.areaCircle(r));
        System.out.println();

        Computer com = new Computer();
        System.out.println("Circle area : " + com.areaCircle(r));
    }
}
