package com.vibfft;

import java.util.Scanner;

/**
 * For its input, the program gets a sequence of non-negative integers; each integer is written on a separate line.
 * The sequence ends with an integer 0; when the program reads 0, it should end its work and output the length of
 * the sequence (not counting the final 0).
 * <p>
 * Don’t read numbers following the number 0.
 */
public class LengthSequenceExercise extends Exercise {

    ExType type;
    ExLevel level;

    LengthSequenceExercise() {
        type = ExType.LENGTH_SEQUENCE;
        level = ExLevel.EASY;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LengthSequenceExercise o = new LengthSequenceExercise();
        o.println(o.toString(o.type, o.level));

        int inputNumber;
        int length = 0;
        do {
            inputNumber = s.nextInt();
            length++;
        } while (inputNumber != 0);

        o.println(length - 1);
    }
}
