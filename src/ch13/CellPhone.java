package ch13;

public class CellPhone {
    String model;
    String color;

    void powerOn() {
        System.out.println("Turn on");
    }
    void powerOff() {
        System.out.println("Turn Off");
    }
    void bell() {
        System.out.println("Bell on");
    }
    void sendVoice(String message) {
        System.out.println("me: " + message);
    }
    void receiveVoice(String message) {
        System.out.println("you: " + message);
    }
    void hangUp() {
        System.out.println("disconnect");
    }

}
