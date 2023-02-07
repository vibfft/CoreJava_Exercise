package com.vibfft;

import java.util.Scanner;

public class IterFactorialExercise extends Exercise {

    ExType type;
    ExLevel level;

    IterFactorialExercise() {
        type = ExType.ITER_FACTORIAL;
        level = ExLevel.MEDIUM;
    }

    // n x (n - 1)! = n! where n! = 1 x 2 x 3 ... (n - 2) x (n - 1) x n
    private int recFactorial(int n) {
        if (n == 0 || n  == 1) {
            return 1;
        } else {
            return n*recFactorial(n - 1);
        }
    }

    private int iterFactorial(int n) {
        int product = 1;

        if (n == 0) {
            return 1;
        } else {
            while (n > 0) {
                product = product * n;
                --n;
            }
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        IterFactorialExercise o = new IterFactorialExercise();
        o.println(o.toString(o.type, o.level));

        int number = s.nextInt();
        o.println(o.iterFactorial(number));
    }
}
