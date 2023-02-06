package com.vibfft;

import java.util.Scanner;

/**
 * Read an integer number N from the input and print all the squares of positive integers:
 *
 * less than or equal to N,
 * in ascending order.
 */
public class SquareExercise extends Exercise {

    ExType type;
    ExLevel level;

    SquareExercise() {
        type = ExType.SQUARE;
        level = ExLevel.EASY;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SquareExercise o = new SquareExercise();
        o.println(o.toString(o.type, o.level));

        int inputNumber = s.nextInt();
        int squared = 1;
        int index = 1;
        while(inputNumber > 0) {
            squared = index * index;

            if (squared > inputNumber) {
                break;
            }
            System.out.println(squared);
            index += 1;
        }
    }
}
