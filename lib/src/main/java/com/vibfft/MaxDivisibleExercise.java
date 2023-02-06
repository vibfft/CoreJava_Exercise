package com.vibfft;

import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
 * There is always an element divisible by 4 in the sequence and the number of elements does not exceed 1000.
 *
 * As input, the program receives the number of elements in the sequence n (first line) and then the elements
 * themselves (next n lines). The program should print a single number: the maximum element of
 * the sequence divisible by 4.
 */
public class MaxDivisibleExercise extends Exercise {

    ExType type;
    ExLevel level;

    MaxDivisibleExercise() {
        type = ExType.MAX_DIVISIBLE;
        level = ExLevel.MEDIUM;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MaxDivisibleExercise o = new MaxDivisibleExercise();
        o.println(o.toString(o.type, o.level));

        int sequenceSize = s.nextInt();
        if (sequenceSize < 1) {
            throw new RuntimeException("Sequence Size is less than 1");
        }
        Integer[] intElements = new Integer[sequenceSize];

        int j = 0;
        int intElement;
        o.println("Sequence Size: " + sequenceSize);
        for (int i = 0; i < sequenceSize; i++) {
            intElement = s.nextInt();
            o.println("Element: " + intElement);
            if (intElement > 30_000) {
                throw new RuntimeException("The natural number is greater than 30000");
            } else if (intElement % 4 == 0) {
                intElements[i] = intElement;
                o.println("Divisible by 4: " + intElements[i] + " i value: " + i);
            } else {
                intElements[i] = 0;
            }
        }
        for (int numbers: intElements) {
            o.println(numbers);
        }
        int max = Collections.max(Arrays.asList(intElements));
        o.println(max);

    }
}