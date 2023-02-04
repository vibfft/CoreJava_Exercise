class Exercise {
    String programType = "Program Type";
    String programLevel = "Program Level";

    enum ExType {
        LOOP,
        SCANNER,
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