package com.demo.stream;

import java.util.stream.Stream;

enum DAYS {
    SUNDAY(7),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);

    private int num;

    private DAYS(int num) {
        this.num = num;
    }

    public int getDayValue() {
        return num;
    }
}

public class EnumStreamDemo {

    public static void main(String[] args) {
        for (DAYS day : DAYS.values()) {
            String num = String.valueOf(day.getDayValue());
            System.out.println(num);
        }

        Stream.of(DAYS.values()).map((e) -> String.valueOf(e.getDayValue())).forEach(System.out::println);
    }
}
