package ch16;

import example_practice.ArrayToStringTest;

public class CatchOrderExample {
    public static void main(String[] args) {
        String[] arr = {"a"};
        try {
            String data1 = arr[0];
            String data2 = arr[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + data2 + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("arr len error");
        } catch (Exception e) {
            System.out.println("error");
        } finally {
            System.out.println("again");
        }
    }
}
