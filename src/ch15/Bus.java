package ch15;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("Run bus");
    }

    public void checkFare() {
        System.out.println("Check");
    }
}
