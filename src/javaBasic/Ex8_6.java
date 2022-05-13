package javaBasic;

public class Ex8_6 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("EXCEPTION");
            throw e;
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Program END");
    }
}
