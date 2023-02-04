package com.vibfft;

import java.util.Scanner;

/**
 * Write a program that finds the tens digit in a non-negative integer N (0 ≤ N ≤ 1000000).
 */

public class TensDigitExercise extends Exercise {

    ExType type;
    ExLevel level;

    TensDigitExercise() {
        type = ExType.TENS_DIGIT;
        level = ExLevel.EASY;
    }

    private int findTensDigit(int number) {
        if ((number < 0) || (number > 1_000_000)) {
            return -1;
        } else if (number < 10) {
            return -2;
        }else {
            number = number / 10;
            return number % 10;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TensDigitExercise o = new TensDigitExercise();
        System.out.println(o.toString(o.type, o.level));

        int tensDigitInt = s.nextInt();
        int retValue = o.findTensDigit(tensDigitInt);
        if (retValue == -1) {
            throw new RuntimeException("Invalid value");
        } else if (retValue == -2) {
            throw new RuntimeException("Number less than 10");
        } else {
            System.out.println(retValue);
        }
    }
}
