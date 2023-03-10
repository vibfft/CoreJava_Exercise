package com.vibfft;

import java.util.ArrayList;
import java.util.List;

class LoopExercise extends Exercise {

    ExType type;
    ExLevel level;

    LoopExercise() {
        type = ExType.LOOP;
        level = ExLevel.EASY;
    }

    public static void main(String[] args) {

        LoopExercise o = new LoopExercise();
        o.println(o.toString(o.type, o.level));

        int number = 12241;
        o.arithmeticExpression(number).forEach(System.out::println);

        for (int num : o.arithmeticExpression(number)) {
            o.println(num);
        }

        for (int i = 0; i < o.arithmeticExpression(number).size(); i++) {
            o.println(o.arithmeticExpression(number).get(i));
        }

        for (Integer integer : o.arithmeticExpression(number)) {
            o.println(integer);
        }
    }

    private List<Integer> arithmeticExpression(int number) {
        List<Integer> numList = new ArrayList<>();

        int digit1 = number % 100;
        numList.add(digit1);

        int digit2 = digit1 / 10;
        numList.add(digit2);

        int digit3 = digit2 % 10;
        numList.add(digit3);

        return numList;
    }
}
