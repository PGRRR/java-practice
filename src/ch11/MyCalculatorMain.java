package ch11;

public class MyCalculatorMain {
    public static void main(String[] args) {
        MyCalculator myCalcu = new MyCalculator();

        double result1 = myCalcu.areaRectangle(10);

        double result2 = myCalcu.areaRectangle(10, 20);

        System.out.println(result1);
        System.out.println(result2);
    }
}
