package javaBasic;

import java.util.Calendar;

public class Ex10_3 {
    public static void main(String[] args) {
        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 30);

        System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY));
        System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY));

        long diff = Math.abs(time1.getTimeInMillis() - time2.getTimeInMillis()) / 1000;
        System.out.println(diff);

        final int[] TIME_UNIT = {3600, 60, 1};
        final String[] TIME_UNIT_NAME = {"시간", "분", "초"};

        String tmp = "";
        for (int i = 0; i < TIME_UNIT.length; i++) { // 거스름돈 동전 개수처럼 큰 단위 부터
            tmp += diff / TIME_UNIT[i] + TIME_UNIT_NAME[i];
            diff %= TIME_UNIT[i];
        }
        System.out.println(tmp);
    }
}
