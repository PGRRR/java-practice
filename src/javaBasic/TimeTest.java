package javaBasic;

class Time {
    private int hour; // 0~23
    private int minute;
    private int second;

    public void setHour(int hour) {
        if (isValidHour(hour)) return;
        this.hour = hour;
    }

    private boolean isValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getHour() {
        return hour;
    } // access read
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
//        t.hour = 100;
        t.setHour(21);
        t.setHour(100);
        System.out.println(t.getHour());
    }
}
