package javaBasic;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest1 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.clear();
        date.set(2022, 0, 31);
        System.out.println(new Date(date.getTimeInMillis()));
    }
}
