package com.vibfft;

import java.util.Scanner;

public class RecordExercise extends Exercise {

    ExType type;
    ExLevel level;

    RecordExercise() {
        type = ExType.SCANNER;
        level = ExLevel.EASY;
    }

    record Person(String name, int age, String gender) {
        //don't change this record
    }


    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Person person = new Person(scanner.next(), scanner.nextInt(), scanner.next());

            System.out.println(person.name() + " is " + person.age() + " years old and is " + person.gender());

    }

}
