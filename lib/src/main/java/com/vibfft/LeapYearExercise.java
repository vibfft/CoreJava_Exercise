package com.vibfft;

import java.util.Scanner;

/**
 * Find whether a given year is a leap year.
 * Just a reminder: a leap year is divisible by 4 AND NOT divisible by 100 OR divisible by 400
 * (for example, the year 2000 is a leap year, but the year 2100 will not be a leap year).
 * The program should work correctly for the years 1900 ≤ n ≤ 3000.
 * Output "Leap" (case-sensitive) if the given year is a leap year, and "Regular" otherwise.
 */
public class LeapYearExercise extends Exercise {

    ExType type;
    ExLevel level;

    LeapYearExercise() {
        type = ExType.LEAP_YEAR;
        level = ExLevel.EASY;
    }

    private void isLeapYear(int leapYear) {
        if (((leapYear % 4 == 0) && (leapYear % 100 != 0)) || (leapYear % 400) == 0 ) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LeapYearExercise o = new LeapYearExercise();
        o.println(o.toString(o.type, o.level));

        int leapYear = s.nextInt();
        if ((leapYear >= 1900) && (leapYear <= 3000)) {
            o.isLeapYear(leapYear);
        }
    }
}
