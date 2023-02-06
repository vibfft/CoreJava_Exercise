package com.vibfft;

public class TernaryExercise extends Exercise {

    ExType type;
    ExLevel level;

    TernaryExercise() {
        type = ExType.TERNARY;
        level = ExLevel.EASY;
    }

    private int formulateEvaluate(int number) {
        return (((number + 1) * number + 2) * number + 3);
    }

    public static void main(String[] args) {
        TernaryExercise o = new TernaryExercise();

        int x = 2;
        int y = 4;

        int z = x - y > 0 ? x - y : x + y;
        //int z = x <= y ? x + y : x - y; equivalent to the previous statement

        int n = 0;
        System.out.println(++n);
        System.out.println(n++);
        System.out.println(n++);

        int d = -1;
        System.out.println(1 - d++);  // 1 - (-1)  == 2

        int a = 4;  // 4
        int b = a++;  // 4, but a becomes 5
        int c = --a + b++;  // 4 + 4 == 8
        int result = ++a - (c++ - b) + c;  // 6 - (9 - 5) + 9
        System.out.println(result);

        int i = 5;
        do {
            i++;
            System.out.print(i + " ");
            i -= 2;
        } while (i > 1);

    }
}
