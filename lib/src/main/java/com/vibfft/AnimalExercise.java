package com.vibfft;

import java.util.Scanner;

/**
 * Print animal stories
 */
public class AnimalExercise extends Exercise {

    ExType type;
    ExLevel level;

    AnimalExercise() {
        type = ExType.SQUARE;
        level = ExLevel.EASY;
    }

    private void printText() {
        System.out.println("I love animals!");
        System.out.println("Let's check on the animals...");
        System.out.println("The deer looks fine.");
        System.out.println("The bat looks happy.");
        System.out.println("The lion looks healthy.");
    }
    public static void main(String[] args) {
        AnimalExercise animal = new AnimalExercise();

        animal.printText();
    }
}
