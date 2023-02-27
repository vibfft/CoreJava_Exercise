package com.vibfft;

import java.util.Scanner;

public class SumAllNumbersGreaterThanNExercise extends Exercise {

    ExType type;
    ExLevel level;

    SumAllNumbersGreaterThanNExercise() {
        type = ExType.SCANNER;
        level = ExLevel.EASY;
    }

    String buildString(int[] arrayElements) {
        StringBuilder builder = new StringBuilder();
        for(int i: arrayElements) {
            builder.append(i);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int arrayLength = s.nextInt(); // length of the array
        int[] arrayElements = new int[arrayLength];
        for (int i = 0; i < arrayElements.length; i++) {
            arrayElements[i] = s.nextInt();
        }

        int n = s.nextInt();

        int sum = 0;
        for (int num: arrayElements) {
            if (num > n) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
