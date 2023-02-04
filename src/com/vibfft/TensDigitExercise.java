package com.vibfft;

import java.util.Scanner;

public class TensDigitExercise extends Exercise {

    ExType type;
    ExLevel level;

    TensDigitExercise() {
        type = ExType.LOOP;
        level = ExLevel.EASY;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TensDigitExercise o = new TensDigitExercise();
        System.out.println(o.toString(o.type, o.level));
    }
}
