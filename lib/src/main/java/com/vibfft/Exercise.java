package com.vibfft;

class Exercise {
    String programType = "Program Type";
    String programLevel = "Program Level";

    enum ExType {
        FUNCTIONAL_DECOMPOSITION,
        IN_BETWEEN,
        ITER_FACTORIAL,
        LEAP_YEAR,
        LENGTH_SEQUENCE,
        LOOP,
        MAX_DIVISIBLE,
        SCANNER,
        SQUARE,
        SWITCH,
        TENS_DIGIT,
        TERNARY,
        TIME_DIFFERENCE
    }

    enum ExLevel {
        EASY,
        MEDIUM,
        HARD,
        VERY_HARD
    }

    String toString(ExType type, ExLevel level) {
        return String.format("%s: %s\n%s: %s", programType, type, programLevel, level);
    }

    @SuppressWarnings(value = {"unchecked"})
    <T> void println(T... args) {
        System.out.println(args[0]);
    }
}