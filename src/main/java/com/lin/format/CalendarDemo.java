package com.lin.format;

import java.util.Calendar;

/**
 *    Calendar是一个抽象类，主要用来操作日历时间字段
 */
public class CalendarDemo {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); //获取日历时间
        System.out.println("当前时间 ：" + calendar.getTime().toLocaleString()); //输出  2019-1-23 21:31:37

        int year = calendar.get(Calendar.YEAR);        //获取年
        int month = calendar.get(Calendar.MONTH) + 1;  //获取月 这里月份的范围为0~11，因此获取月份的时候需要+1才是当前月份值
        int day = calendar.get(Calendar.DAY_OF_MONTH);         //获取日
        //int hour = calendar.get(Calendar.HOUR);        //获取时
         int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24小时表示
        int minute = calendar.get(Calendar.MINUTE);    //获取分
        int second = calendar.get(Calendar.SECOND);    //获取秒
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);  //星期，英语国家星期从星期日开始计算
        System.out.println("当前时间 ：" + year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second + " 星期" + weekday);

        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);  //获取今天是今年的第几天
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); //获取今天是这个月的第几天
        System.out.println("今天是今年的第" + dayOfYear + "天");
        System.out.println("今天是这个月的第" + dayOfMonth + "天");

        //给某些属性增添指定量

        // 一年后的今天   同理换成下个月的今天calendar.add(Calendar.MONTH, 1);
//        calendar.add(Calendar.YEAR,1);
//        year = calendar.get(Calendar.YEAR);
//        month = calendar.get(Calendar.MONTH) + 1;
//        day = calendar.get(Calendar.DAY_OF_MONTH);
//        System.out.println("一年后的时间 ：" + year + "-" + month + "-" + day);


        // 获取任意一个月的最后一天
        // 假设求6月的最后一天
        int currentMonth = 2;
        // 先求出7月份的第一天，实际中这里6为外部传递进来的currentMonth变量
        calendar.set(calendar.get(Calendar.YEAR), currentMonth, 1);
        calendar.add(Calendar.DATE, -1);
        // 获取日
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(currentMonth + "月份的最后一天为" + day + "号");


        // 设置日期
        calendar.set(Calendar.YEAR, 2000);
        System.out.println("现在是" + calendar.get(Calendar.YEAR) + "年");
        calendar.set(2008, 8, 8);
        // 获取年
        year = calendar.get(Calendar.YEAR);
        // 获取月
        month = calendar.get(Calendar.MONTH);
        // 获取日
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("现在是" + year + "年" + month + "月" + day + "日");


    }
}
