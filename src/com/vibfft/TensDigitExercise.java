package com.vibfft;

import java.util.Scanner;

public class TensDigitExercise extends Exercise {

    ExType type;
    ExLevel level;

    TensDigitExercise() {
        type = ExType.LOOP;
        level = ExLevel.EASY;
    }

    private int formulateEvaluate(int number) {
        return (((number + 1) * number + 2) * number + 3);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TensDigitExercise o = new TensDigitExercise();
        System.out.println(o.toString(o.type, o.level));

        System.out.println(o.formulateEvaluate(s.nextInt()));
    }
}
