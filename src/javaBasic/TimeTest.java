package javaBasic;

class Time {
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        if (isNotValidHour(hour)) return;
        this.hour = hour;
    }

    private boolean isNotValidHour(int hour) {
        return !(0 < hour && hour < 25);
    }

    public int getHour() {
        return hour;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(24);
        System.out.println(t.getHour());
    }
}
