package com.vibfft;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class TimeDifferenceExercise extends Exercise {

    ExType type;
    ExLevel level;

    TimeDifferenceExercise() {
        type = ExType.TIME_DIFFERENCE;
        level = ExLevel.EASY;
    }

    private int secondDifference(String[] strArray) {
        int firstTime = 0, secondTime = 0;
        int[] intArray = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            if ((i % 3) == 0) {
                // hour
                intArray[i] = 60 * 60 * parseInt(strArray[i]);
            } else if ((i % 3) == 1) {
                // minute
                intArray[i] = 60 * parseInt(strArray[i]);
            } else {
                // second
                intArray[i] = parseInt(strArray[i]);
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            if (i < 3) {
                firstTime += intArray[i];
            } else {
                secondTime += intArray[i];
            }
        }
        return secondTime - firstTime;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        TimeDifferenceExercise o = new TimeDifferenceExercise();
        o.println(o.toString(o.type, o.level));

        o.println("The program gets the input of six integers: " +
                "three defining the first moment of time in hours, minutes, " +
                "seconds, and the other three defining the second one.");
        o.println("Please enter six integers: ");

        String[] stringArray = new String[6];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = s.nextLine();
        }

        o.println("\nYou have entered: ");
        for (String str : stringArray) {
            o.println(str);
        }

        o.println(o.secondDifference(stringArray));
    }
}
