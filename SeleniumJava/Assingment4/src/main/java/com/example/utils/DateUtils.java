package com.example.utils;

import java.time.LocalDate;

public class DateUtils {

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static int getYearFromDate(LocalDate date) {
        if (date == null) throw new IllegalArgumentException("Date cannot be null");
        return date.getYear();
    }

    public static boolean isWeekend(LocalDate date) {
        if (date == null) return false;
        switch (date.getDayOfWeek()) {
            case SATURDAY, SUNDAY -> { return true; }
            default -> { return false; }
        }
    }
}
