package com.jaimrooc.junit.tdd.leapyear;

public class DateUtil {

    // Basic version (end TDD implementation)
   /* public static boolean isLeapYear(int year) {
        if(year % 4 == 0 && year % 100 != 0) {
            return true;
        }

        if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }*/

    // Refactor code, post TDD implementation
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
