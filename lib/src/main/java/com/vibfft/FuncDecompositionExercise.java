package com.vibfft;

import java.util.Scanner;

public class FuncDecompositionExercise extends Exercise {

    ExType type;
    ExLevel level;

    FuncDecompositionExercise() {
        type = ExType.FUNCTIONAL_DECOMPOSITION;
        level = ExLevel.EASY;
    }

    public static double f(double x) {

        double returnVal = 0.0;
        if (x <= 0) {
            returnVal = f1(x);
        } else if (x < 1 && x > 0) {
            returnVal = f2(x);
        } else if (x >= 1) {
            returnVal = f3(x);
        }
        return returnVal;
    }

    public static double f1(double x) {
        // X**2 + 1
        return Math.pow(x,2) + 1;

    }

    public static double f2(double x) {
        // 1/X**2
        return 1/(Math.pow(x,2));
    }

    public static double f3(double x) {
        // X**2 - 1
        return Math.pow(x,2) - 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        FuncDecompositionExercise o = new FuncDecompositionExercise();
        o.println(o.toString(o.type, o.level));

        double x = s.nextDouble();
        System.out.println(f(x));
    }
}
