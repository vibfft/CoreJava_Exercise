package com.vibfft;

import java.util.Scanner;

public class SwitchExercise extends Exercise {

    ExType type;
    ExLevel level;

    SwitchExercise() {
        type = ExType.SWITCH;
        level = ExLevel.EASY;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SwitchExercise o = new SwitchExercise();
        o.println(o.toString(o.type, o.level));

        int action = s.nextInt();
        switch (action) {
            case 1 -> System.out.println("You have chosen a square");
            case 2 -> System.out.println("You have chosen a circle");
            case 3 -> System.out.println("You have chosen a triangle");
            case 4 -> System.out.println("You have chosen a rhombus");
            default -> System.out.println("There is no such shape!");
        }
//        String action = s.next();
//        switch (action) {
//            case "gryffindor" -> o.println("bravery");
//            case "hufflepuff" -> o.println("loyalty");
//            case "slytherin" -> o.println("cunning");
//            case "ravenclaw" -> o.println("intellect");
//            default -> o.println("not a valid house");
//        }
    }
}
