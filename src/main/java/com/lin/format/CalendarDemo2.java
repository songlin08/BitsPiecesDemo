package com.lin.format;

import java.util.Calendar;

public class CalendarDemo2 {

    //Java 编程,打印昨天的当前时刻
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DATE, -1);

        System.out.println(calendar.getTime());
    }
}
