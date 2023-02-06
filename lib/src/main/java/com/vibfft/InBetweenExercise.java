package com.vibfft;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Write a program that reads three integer numbers and prints true if the first number is between the second
 * and the third one (inclusive). Otherwise, it must print false.
 *
 * The last two arguments may not be sorted.
 */
public class InBetweenExercise extends Exercise {

    ExType type;
    ExLevel level;

    InBetweenExercise() {
        type = ExType.IN_BETWEEN;
        level = ExLevel.EASY;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        InBetweenExercise o = new InBetweenExercise();
        o.println(o.toString(o.type, o.level));

        int[] intArray = new int[3];

        int i = 0;
        while(s.hasNext()) {
            intArray[i] = s.nextInt();
            i++;
            if (i == 3) {
                break;
            }
        }
        boolean state = false;
        if (intArray[0] >= intArray[1]  && intArray[0] <= intArray[2]) {
            state = true;
        } else if (intArray[0] <= intArray[1] && intArray[0] >= intArray[2]) {
            state = true;
        }
        o.println(state);
    }
}
