package com.vibfft;

class Exercise {
    String programType = "Program Type";
    String programLevel = "Program Level";

    enum ExType {
        IN_BETWEEN,
        LEAP_YEAR,
        LENGTH_SEQUENCE,
        LOOP,
        MAX_DIVISIBLE,
        SCANNER,
        SQUARE,
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

    public String toString(ExType type, ExLevel level) {
        return String.format("%s: %s\n%s: %s", programType, type, programLevel, level);
    }
}